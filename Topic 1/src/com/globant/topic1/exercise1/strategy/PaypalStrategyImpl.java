package com.globant.topic1.exercise1.strategy;

//Concrete Strategy
public class PaypalStrategyImpl implements IPaymentMethodStrategy {

	// Fields
	private String email;
	private String password;

	// Constructor
	public PaypalStrategyImpl(String email, String password) {
		this.email = email;
		this.password = email;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Payment using Paypal successful, amount: " + amount);

	}

}
