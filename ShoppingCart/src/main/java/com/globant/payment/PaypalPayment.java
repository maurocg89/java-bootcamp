package com.globant.payment;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.globant.entity.Cart;

//Concrete Strategy
@Component
@JsonTypeName(value = "paypal")
public class PaypalPayment implements IPaymentMethod {

	// Fields
	private String email;
	private String password;
	private final String method = "Paypal";

	public PaypalPayment(String email, String password) {
		this.email = email;
		this.password = email;
	}

	public PaypalPayment() {

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public double calculateDiscount(Cart cart) {
		return cart.getCheapestItem().getProduct().getPrice();
	}

	@Override
	public String getMethod() {
		return method;
	}

	@Override
	public String toString() {
		return "PaypalPayment [email=" + email + ", password=" + password + ", method=" + method + "]";
	}

}