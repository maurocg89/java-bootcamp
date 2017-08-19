package com.globant.payment.impl;
import org.springframework.stereotype.Service;

import com.globant.entity.Cart;
import com.globant.payment.PaymentMethodService;

//Concrete Strategy
@Service
public class PaypalPaymentServiceImpl implements PaymentMethodService {

	// Fields
	private String email;
	private String password;

/*	// Constructor
	public PaypalPaymentServiceImpl(String email, String password) {
		this.email = email;
		this.password = email;
	}
*/
	@Override
	public void payCart(Cart cart) {
		 double total = (cart.getTotal() - calculateDiscount(cart));
		 //paymentRepository.addPayment(cart, total, discount, date);

	}

	@Override
	public double calculateDiscount(Cart cart) {
		return cart.getCheapestItem().getProduct().getPrice();
	}

}