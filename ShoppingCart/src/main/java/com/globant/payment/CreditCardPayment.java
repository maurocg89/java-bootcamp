package com.globant.payment;

import com.globant.entity.Cart;

//Concrete Strategy
public class CreditCardPayment implements IPaymentMethod {

	// Fields
	private static final double DISCOUNT = 0.1;
	private String name;
	private String cardNumber;
	private String verificationNumber;
	private String expirationDate;
	private PaymentMethod method;

	// Constructor
	public CreditCardPayment(String name, String cardNumber, String verificationNumber, String expirationDate) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.verificationNumber = verificationNumber;
		this.expirationDate = expirationDate;
		this.method.setType(PaymentMethod.PaymentType.CREDIT_CARD);
	}

	@Override
	public void payCart(Cart cart) {
		 double total = (cart.getTotal() - calculateDiscount(cart));
		 //paymentRepository.addPayment(cart, total, discount, date);
		 
	}

	@Override
	public double calculateDiscount(Cart cart) {
		return cart.getTotal() * DISCOUNT;
	}

	@Override
	public PaymentMethod getType() {
		return this.method;
	}

  
}