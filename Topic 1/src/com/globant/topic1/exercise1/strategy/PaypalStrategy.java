package com.globant.topic1.exercise1.strategy;

import com.globant.topic1.exercise1.model.Cart;

//Concrete Strategy
public class PaypalStrategy implements IPaymentMethodStrategy {

	// Fields
	private String email;
	private String password;

	// Constructor
	public PaypalStrategy(String email, String password) {
		this.email = email;
		this.password = email;
	}

	@Override
	public void pay(Cart cart) {
		System.out.println("Payment using Paypal successful. Total amount: " + cart.getTotal()
				+ ", amount with discount: " + (cart.getTotal() - calculateDiscount(cart)));

	}

	@Override
	public double calculateDiscount(Cart cart) {
		return cart.getCheaperItem().getProduct().getPrice();
	}
	
	
	

}
