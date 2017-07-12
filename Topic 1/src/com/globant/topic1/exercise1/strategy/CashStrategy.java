package com.globant.topic1.exercise1.strategy;

// Concrete Strategy
public class CashStrategy implements IPaymentMethodStrategy {

	@Override
	public void pay(double amount) {
		System.out.println("Payment with Cash successful, amount: " + amount);
	}

}
