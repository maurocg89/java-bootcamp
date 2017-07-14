package com.globant.topic1.exercise1.strategy;

//Concrete Strategy
public class CreditCardStrategyImpl implements IPaymentMethodStrategy {
	
	// Fields
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
	public void pay(double amount) {
		System.out.println("Payment using Credit Card successful, amount: " + amount);

	}

}
