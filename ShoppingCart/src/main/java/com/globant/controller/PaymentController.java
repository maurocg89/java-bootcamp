package com.globant.controller;

import java.text.DecimalFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globant.entity.Cart;
import com.globant.entity.Payment;
import com.globant.payment.PaymentMethod;
import com.globant.payment.PaymentMethodService;
import com.globant.service.CartService;

@RestController
@RequestMapping("/payments")
public class PaymentController {

	@Autowired
	@Qualifier("creditCardPaymentServiceImpl")
	private PaymentMethodService creditCardService;

	@Autowired
	@Qualifier("paypalPaymentServiceImpl")
	private PaymentMethodService paypalService;

	@Autowired
	@Qualifier("cartServiceImpl")
	private CartService cartService;

	/*
	 * @GetMapping public ResponseEntity<List<Payment>> getAllPayments(){
	 * 
	 * }
	 */

	/*
	 * @GetMapping("/{id}") public void getPaymentById(@PathVariable Long id){
	 * 
	 * }
	 */
	@PostMapping("/{idCart}")
	public ResponseEntity<String> getCreditCardAmount(@PathVariable Long idCart, @RequestBody PaymentMethod method) {
		Cart cart = cartService.getCartById(idCart);
		if (cart == null) {
			return new ResponseEntity<String>("",HttpStatus.BAD_REQUEST);
		}
		double total = cart.getTotal();
		double discount = 0;
		DecimalFormat df = new DecimalFormat("00.00");

		if (method.getType().equals(PaymentMethod.PaymentType.CREDIT_CARD)) {
			discount = creditCardService.calculateDiscount(cart);
		} else if (method.getType().equals(PaymentMethod.PaymentType.PAYPAL)) {
			discount = paypalService.calculateDiscount(cart);
		} else{
			return new ResponseEntity<String>("",HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<String>(
				"SubTotal: " + df.format(total) + "\nDiscount: " + df.format(discount) + "\nTotal to pay: " + df.format(total - discount),
				HttpStatus.OK);

	}

	@GetMapping("/{idCart}/paypal/")
	public void getPayPalAmount(@PathVariable Long id) {
	}

	@PostMapping("/{idCart}/pay")
	public void addPayment(@RequestBody Payment payment) {

	}

	@PostMapping("/{idCart}/paypal/pay")
	public void addPaymentPaypal(@RequestBody Payment payment) {

	}

	@PutMapping
	public void updatePayment(@RequestBody Payment payment) {
	}

	@DeleteMapping("/{id}")
	public void deletePayment(@PathVariable Long id) {
	}
}
