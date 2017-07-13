package com.globant.topic1.exercise1.test;

import com.globant.topic1.exercise1.model.Cart;
import com.globant.topic1.exercise1.model.Item;
import com.globant.topic1.exercise1.model.Payment;
import com.globant.topic1.exercise1.model.Product;
import com.globant.topic1.exercise1.strategy.CashStrategy;

public class TestShoppingCart {
	public static void main(String[] args) {

		Cart cart = new Cart();
		Product p1 = new Product(1, 10, "asd", "asd");
		Product p2 = new Product(2, 20, "asd", "asd");
		Product p3 = new Product(3, 20, "asd", "asd");
		Product p4 = new Product(4, 20, "asd", "asd");

		cart.addItem(new Item(p1, 2));
		cart.addItem(new Item(p2, 1));
		cart.addItem(new Item(p1, 2));
		System.out.println(cart.getAllItems());
		System.out.println(cart.getTotal());
	
		Payment payment = new Payment(cart, new CashStrategy());

	}
}
