package com.globant.topic1.exercise1.model;

import com.globant.topic1.exercise1.singleton.PaymentNumber;
import com.globant.topic1.exercise1.strategy.IPaymentMethodStrategy;

public class Payment {

	private Cart cart;
	private IPaymentMethodStrategy paymentMethod;
	private int paymentId;

	public Payment(Cart cart, IPaymentMethodStrategy paymentMethod) {

		this.cart = cart;
		this.paymentMethod = paymentMethod;
		paymentId = PaymentNumber.getInstance().getPaymentId();
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

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public void pay() {
		paymentMethod.pay(cart);
		System.out.println("Identification number of the payment: " + paymentId);
	}

}
