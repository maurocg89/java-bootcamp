package com.globant.topic1.exercise1.test;

import com.globant.topic1.exercise1.model.Cart;
import com.globant.topic1.exercise1.model.Item;
import com.globant.topic1.exercise1.model.Offer;
import com.globant.topic1.exercise1.model.Payment;
import com.globant.topic1.exercise1.model.Product;
import com.globant.topic1.exercise1.strategy.CashStrategyImpl;
import com.globant.topic1.exercise1.strategy.CreditCardStrategyImpl;
import com.globant.topic1.exercise1.strategy.PaypalStrategyImpl;

public class TestShoppingCart {
	public static void main(String[] args) {

		Cart cart = new Cart(1);

		Product p1 = new Product(1, 10, "product 1", "desc 1");
		Product p2 = new Product(2, 50, "product 2", "desc 2");
		Product p3 = new Product(3, 20, "product 3", "desc 3");
		Product p4 = new Product(4, 30, "product 4", "desc 4");
		Item it1 = new Item(p1, 2);

		cart.addItem(new Item(p1, 2));
		cart.addItem(new Item(p2, 1));
		cart.addItem(new Item(p1, 2));
		cart.addItem(new Item(p3, 3));
		cart.addItem(new Item(p4, 4));
		cart.addItem(it1);

		System.out.println(cart.getAllItems());
		System.out.println(cart.getTotal());
		cart.displayList();
		
		cart.removeItem(it1);
		cart.removeItem(it1);
		
		// Testing payments
		System.out.println(cart.getCheapestItem());
		System.out.println(cart.getMostExpensiveItem());
		Payment payment = new Payment(cart, new CashStrategyImpl());
		Payment payment2 = new Payment(cart, new CreditCardStrategyImpl("asd", "123", "123", "12/18"));
		Payment payment3 = new Payment(cart, new PaypalStrategyImpl("asd@asd.com", "password"));
		payment.pay();
		payment2.pay();
		payment3.pay();
		
		// Testing offers
		Offer offer1 = new Offer("Black Friday");
		Offer offer2 = new Offer("Black Monday");
		offer1.addProduct(p1);
		offer1.addProduct(p2);
		System.out.println(offer1);
		offer1.removeProduct(p2);
		offer2.removeProduct(p1);
		
		
	}
}
