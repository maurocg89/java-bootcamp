package com.globant.topic1.exercise1.strategy;

import com.globant.topic1.exercise1.model.Cart;

// Strategy Interface
public interface IPaymentMethodStrategy {
	
	public void pay(Cart cart);

	public double calculateDiscount(Cart cart);

}
