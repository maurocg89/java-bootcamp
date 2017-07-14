package com.globant.topic1.exercise1.strategy;

import com.globant.topic1.exercise1.model.Cart;

//Concrete Strategy
public class CreditCardStrategyImpl implements IPaymentMethodStrategy {

	// Fields
	private static final double DISCOUNT = 0.1;
	private String name;
	private String cardNumber;
	private String verificationNumber;
	private String expirationDate;

	// Constructor
	public CreditCardStrategyImpl(String name, String cardNumber, String verificationNumber, String expirationDate) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.verificationNumber = verificationNumber;
		this.expirationDate = expirationDate;
	}

	@Override
	public void pay(Cart cart) {
		System.out.println("Payment using Credit Card successful. Total amount: " + cart.getTotal()
				+ ", amount with discount: " + (cart.getTotal() - calculateDiscount(cart)));

	}

	@Override
	public double calculateDiscount(Cart cart) {
		return cart.getTotal() * DISCOUNT;
	}

}
