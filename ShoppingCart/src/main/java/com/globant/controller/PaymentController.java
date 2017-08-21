package com.globant.controller;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globant.entity.Cart;
import com.globant.entity.Payment;
import com.globant.payment.CreditCardPayment;
import com.globant.payment.IPaymentMethod;
import com.globant.payment.PaypalPayment;
import com.globant.service.CartService;
import com.globant.service.PaymentMethodService;

@RestController
@RequestMapping("/payments")
public class PaymentController {

	@Autowired
	@Qualifier("paymentMethodServiceImpl")
	private PaymentMethodService paymentMethodService;

	@Autowired
	@Qualifier("cartServiceImpl")
	private CartService cartService;

	@GetMapping
	public ResponseEntity<List<Payment>> getAllPayments() {
		return new ResponseEntity<List<Payment>>(paymentMethodService.getAllPayments(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Payment> getPaymentById(@PathVariable Long id) {
		Payment payment = paymentMethodService.getPaymentById(id);
		if (payment == null) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Payment>(payment, HttpStatus.OK);
	}

	@GetMapping("/cart/{idCart}")
	public ResponseEntity<Payment> getPaymentByCartId(@PathVariable Long idCart) {
		Cart cart = cartService.getCartById(idCart);
		if (cart == null) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		if (!cart.getPaid()) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Payment>(paymentMethodService.getPaymentByCartId(idCart), HttpStatus.OK);
	}

	@GetMapping("/{idCart}/paypal")
	public ResponseEntity<String> getPaypalAmount(@PathVariable Long idCart) {
		Cart cart = cartService.getCartById(idCart);
		PaypalPayment pp = new PaypalPayment();
		if (cart == null) {
			return new ResponseEntity<String>("There is no cart with id: " + idCart, HttpStatus.NO_CONTENT);
		}
		double total = cart.getTotal();
		double discount = pp.calculateDiscount(cart);
		DecimalFormat df = new DecimalFormat("00.00");
		return new ResponseEntity<String>("Paypal method\nSubTotal: " + df.format(total) + "\nDiscount: "
				+ df.format(discount) + "\nTotal to pay: " + df.format(total - discount), HttpStatus.OK);

	}

	@GetMapping("/{idCart}/creditCard")
	public ResponseEntity<String> getCreditCardAmount(@PathVariable Long idCart) {
		Cart cart = cartService.getCartById(idCart);
		CreditCardPayment cc = new CreditCardPayment();
		if (cart == null) {
			return new ResponseEntity<String>("There is no cart with id: " + idCart, HttpStatus.NO_CONTENT);
		}
		double total = cart.getTotal();
		double discount = cc.calculateDiscount(cart);
		DecimalFormat df = new DecimalFormat("00.00");
		return new ResponseEntity<String>("Credit card method\nSubTotal: " + df.format(total) + "\nDiscount: "
				+ df.format(discount) + "\nTotal to pay: " + df.format(total - discount), HttpStatus.OK);

	}

	// JSON: {"creditCart/paypal:{"parameters":"values"}"}
	@PostMapping("/{idCart}/pay")
	public ResponseEntity<String> addPayment(@PathVariable Long idCart, @RequestBody IPaymentMethod method) {
		Cart cart = cartService.getCartById(idCart);
		if (cart == null) {
			return new ResponseEntity<String>("There is no cart with id: " + idCart, HttpStatus.NO_CONTENT);
		}
		if (cart.getPaid()) {
			return new ResponseEntity<String>("The cart is already paid", HttpStatus.NO_CONTENT);
		}

		double total = cart.getTotal();
		double discount = method.calculateDiscount(cart);
		DecimalFormat df = (DecimalFormat) NumberFormat.getInstance(Locale.ENGLISH);
		df.applyPattern("00.00");
		double amountToPay = Double.valueOf(df.format(total - discount));

		paymentMethodService.payCart(cart, method, amountToPay);

		return new ResponseEntity<String>("Payment method: " + method.getMethod().toString() + "\nSubTotal: "
				+ df.format(total) + "\nDiscount: " + df.format(discount) + "\nTotal paid: " + amountToPay,
				HttpStatus.CREATED);
	}
}
