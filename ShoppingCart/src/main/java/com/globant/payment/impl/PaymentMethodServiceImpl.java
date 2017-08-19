package com.globant.payment.impl;

import com.globant.entity.Cart;
import com.globant.payment.IPaymentMethod;
import com.globant.payment.PaymentMethodService;

public class PaymentMethodServiceImpl implements PaymentMethodService {

	private IPaymentMethod method;
	
	@Override
	public void payCart(Cart cart) {
		method.payCart(cart);
	}

	@Override
	public double calculateDiscount(Cart cart) {
		// TODO Auto-generated method stub
		return 0;
	}

}
