package com.globant.topic1.exercise1.model;

import java.util.ArrayList;
import java.util.List;

import com.globant.topic1.exercise1.strategy.IPaymentMethodStrategy;

public class Cart {

	private List<Item> items;
	// private Map<Product, Integer> productsMap;
	private IPaymentMethodStrategy paymentMethod;

	public Cart() {
		this.items = new ArrayList<>();
	}

	public void addItem(Item newItem) {
		// If item exist, add the new quantity
		if (items.contains(newItem)) {
			int pos = items.indexOf(newItem);
			Item oldItem = items.get(pos);
			oldItem.setQuantity(oldItem.getQuantity() + newItem.getQuantity());
		} else {
			this.items.add(newItem);
		}
	}

	public void removeItem(Item item) {
		this.items.remove(item);
	}

	public List<Item> getAllItems() {
		return items;
	}

	public double getTotal() {
		double total = 0;
		for (Item item : items) {
			total += item.getProduct().getPrice() * item.getQuantity();
		}

		return total;
	}

	public IPaymentMethodStrategy getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(IPaymentMethodStrategy paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public void pay() {
		paymentMethod.pay(getTotal());
	}

}
