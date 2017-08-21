package com.globant.payment;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.globant.entity.Cart;

//Concrete Strategy
@Component
@JsonTypeName(value = "creditCard")
public class CreditCardPayment implements IPaymentMethod {

	// Fields
	private static final double DISCOUNT = 0.1;
	private String name;
	private String cardNumber;
	private String verificationNumber;
	private String expirationDate;
	private final String method = "Credit Card";

	// Constructor
	public CreditCardPayment(String name, String cardNumber, String verificationNumber, String expirationDate) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.verificationNumber = verificationNumber;
		this.expirationDate = expirationDate;
	}

	public CreditCardPayment() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getVerificationNumber() {
		return verificationNumber;
	}

	public void setVerificationNumber(String verificationNumber) {
		this.verificationNumber = verificationNumber;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Override
	public double calculateDiscount(Cart cart) {
		return cart.getTotal() * DISCOUNT;
	}

	@Override
	public String getMethod() {
		return method;
	}

	@Override
	public String toString() {
		return "CreditCardPayment [name=" + name + ", cardNumber=" + cardNumber + ", verificationNumber="
				+ verificationNumber + ", expirationDate=" + expirationDate + ", method=" + method + "]";
	}

}