package com.globant.service;

import java.util.List;

import com.globant.entity.Cart;
import com.globant.entity.Payment;
import com.globant.payment.IPaymentMethod;

public interface PaymentMethodService {

	public void payCart(Cart cart, IPaymentMethod paymentMethod, double amount);

	public List<Payment> getAllPayments();

	public Payment getPaymentById(Long id);

	public Payment getPaymentByCartId(Long idCart);
}
