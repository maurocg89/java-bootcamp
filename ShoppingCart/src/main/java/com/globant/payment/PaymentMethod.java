package com.globant.payment;

public class PaymentMethod {

	PaymentType type;

	public PaymentType getType() {
		return type;
	}

	public void setType(PaymentType type) {
		this.type = type;
	}

	public enum PaymentType {
		CREDIT_CARD, PAYPAL;
	}
}
