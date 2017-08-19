package com.globant.payment;

import com.globant.entity.Cart;

public interface IPaymentMethod {
	
	PaymentMethod getType();
	
	void payCart(Cart cart);
	
	double calculateDiscount(Cart cart);
}
