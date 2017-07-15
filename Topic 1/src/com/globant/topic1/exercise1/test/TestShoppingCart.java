package com.globant.topic1.exercise1.test;

import com.globant.topic1.exercise1.model.Cart;
import com.globant.topic1.exercise1.model.Item;
import com.globant.topic1.exercise1.model.Payment;
import com.globant.topic1.exercise1.model.Product;
import com.globant.topic1.exercise1.strategy.CashStrategyImpl;
import com.globant.topic1.exercise1.strategy.CreditCardStrategyImpl;
import com.globant.topic1.exercise1.strategy.PaypalStrategyImpl;

public class TestShoppingCart {
	public static void main(String[] args) {

		Cart cart = new Cart(1);
		Cart cart2 = new Cart(2);

		Product p1 = new Product(1, 10, "asd", "asd");
		Product p2 = new Product(2, 50, "asd", "asd");
		Product p3 = new Product(3, 20, "asd", "asd");
		Product p4 = new Product(4, 30, "asd", "asd");
    Item it1 = new Item(p1,2);
    
		cart.addItem(new Item(p1, 2));
		cart.addItem(new Item(p2, 1));
		cart.addItem(new Item(p1, 2));
		cart.addItem(new Item(p3, 3));
		cart.addItem(new Item(p4, 4));
		cart.addItem(it1);
    
		System.out.println(cart.getAllItems());
		System.out.println(cart.getTotal());
		
    cart.removeItem(it1);
		cart.removeItem(it1);
    
		System.out.println(cart.getCheapestItem());
		System.out.println(cart.getMostExpensiveItem());
	
		Payment payment = new Payment(cart, new CashStrategyImpl());
		Payment payment2 = new Payment(cart, new CreditCardStrategyImpl("asd","123","123","12/18"));
		Payment payment3 = new Payment(cart, new PaypalStrategyImpl("asd@asd.com","password"));
		payment.pay();
		payment2.pay();
		payment3.pay();
	}
}
