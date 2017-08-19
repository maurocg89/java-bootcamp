package com.globant.payment.impl;

import org.springframework.stereotype.Service;

import com.globant.entity.Cart;
import com.globant.payment.PaymentMethodService;

//Concrete Strategy
@Service
public class CreditCardPaymentServiceImpl implements PaymentMethodService {

	// Fields
	private static final double DISCOUNT = 0.1;
	private String name;
	private String cardNumber;
	private String verificationNumber;
	private String expirationDate;

	// Constructor
	/*public CreditCardPaymentServiceImpl(String name, String cardNumber, String verificationNumber, String expirationDate) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.verificationNumber = verificationNumber;
		this.expirationDate = expirationDate;
	}*/

	@Override
	public void payCart(Cart cart) {
		 double total = (cart.getTotal() - calculateDiscount(cart));
		 //paymentRepository.addPayment(cart, total, discount, date);
		 
	}

	@Override
	public double calculateDiscount(Cart cart) {
		return cart.getTotal() * DISCOUNT;
	}

  
}