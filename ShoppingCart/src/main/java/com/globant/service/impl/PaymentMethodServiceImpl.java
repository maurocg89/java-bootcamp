package com.globant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.globant.entity.Cart;
import com.globant.entity.Payment;
import com.globant.payment.IPaymentMethod;
import com.globant.repository.CartRepository;
import com.globant.repository.PaymentRepository;
import com.globant.service.PaymentMethodService;

@Service
public class PaymentMethodServiceImpl implements PaymentMethodService {

	@Autowired
	@Qualifier("paymentRepository")
	PaymentRepository paymentRepository;

	@Autowired
	@Qualifier("cartRepository")
	CartRepository cartRepository;

	@Override
	public void payCart(Cart cart, IPaymentMethod method, double amount) {
		Payment payment = new Payment(cart, method.getMethod(), amount);
		paymentRepository.save(payment);
		cart.setPaid(true);
		cart.setPayment(payment);
		cartRepository.save(cart);
	}

	@Override
	public List<Payment> getAllPayments() {
		return paymentRepository.findAll();
	}

	@Override
	public Payment getPaymentById(Long id) {
		return paymentRepository.findOne(id);
	}

	@Override
	public Payment getPaymentByCartId(Long idCart) {
		return paymentRepository.findPaymentByCartId(idCart);
	}

}
