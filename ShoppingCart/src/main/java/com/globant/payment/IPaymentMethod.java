package com.globant.payment;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.globant.entity.Cart;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.WRAPPER_OBJECT)
@JsonSubTypes({ @JsonSubTypes.Type(name = "creditCard", value = CreditCardPayment.class),
		@JsonSubTypes.Type(name = "paypal", value = PaypalPayment.class) })
public interface IPaymentMethod {

	String getMethod();

	double calculateDiscount(Cart cart);
}
