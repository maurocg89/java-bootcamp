package com.globant.topic1.exercise1.strategy;

public class CreditCardStrategy implements IPaymentMethodStrategy {

	private String name;
	private String cardNumber;
	private String verificationNumber;
	private String expirationDate;

	public CreditCardStrategy(String name, String cardNumber, String verificationNumber, String expirationDate) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.verificationNumber = verificationNumber;
		this.expirationDate = expirationDate;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Payment using Credit Card successful, amount: " + amount);

	}

}
