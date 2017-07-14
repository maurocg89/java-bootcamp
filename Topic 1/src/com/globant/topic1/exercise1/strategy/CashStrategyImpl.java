package com.globant.topic1.exercise1.strategy;

import com.globant.topic1.exercise1.model.Cart;

// Concrete Strategy
public class CashStrategyImpl implements IPaymentMethodStrategy {
	
	private static final double DISCOUNT_EXPENSIVE_PRODUCT = 0.9;
	
	@Override
	public void pay(Cart cart) {
		System.out.println("Payment with Cash successful. Total amount: " + cart.getTotal()
				+ ", amount with discount: " + (cart.getTotal() - calculateDiscount(cart)));
	}

	@Override
	public double calculateDiscount(Cart cart) {
		return cart.getMostExpensiveItem().getProduct().getPrice() * DISCOUNT_EXPENSIVE_PRODUCT;
	}
	
	
	
}
