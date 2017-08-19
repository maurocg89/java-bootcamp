package com.globant.payment;

import com.globant.entity.Cart;

public interface PaymentMethodService {
	
	public void payCart(Cart cart);

	public double calculateDiscount(Cart cart);
}
