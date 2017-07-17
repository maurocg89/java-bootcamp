package com.globant.topic1.exercise1.singleton;

// Singleton pattern
public class PaymentNumber {
	
	private static PaymentNumber paymentNumber = null;
	private int paymentId;

	private PaymentNumber() {

		paymentId = 1;
	}

	public int getPaymentId() {
		return paymentId++;
	}

	public static PaymentNumber getInstance() {
		if (paymentNumber == null) {
			paymentNumber = new PaymentNumber();
		}

		return paymentNumber;
	}

}
