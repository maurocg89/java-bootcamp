package com.globant.topic1.exercise1.model;

import com.globant.topic1.exercise1.strategy.IPaymentMethodStrategy;

public class Payment {

	private Cart cart;
	private IPaymentMethodStrategy paymentMethod;

	public Payment(Cart cart, IPaymentMethodStrategy paymentMethod) {

		this.cart = cart;
		this.paymentMethod = paymentMethod;

	}

	// Getters and Setters
	public IPaymentMethodStrategy getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(IPaymentMethodStrategy paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public void pay() {
		paymentMethod.pay(cart);
	}

}
