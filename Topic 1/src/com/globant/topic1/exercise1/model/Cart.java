package com.globant.topic1.exercise1.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	// Fields
	private int id;
	private List<Item> items;

	// Constructor
	public Cart(int id) {
		this.items = new ArrayList<>();
		this.id = id;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
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
		if (items.size() == 0) {
			System.out.println("The cart is empty");
		} else if (items.contains(item)) {
			items.get(items.indexOf(item));
			this.items.remove(item);
			System.out.println("The item " + item.getProduct() + " was removed successfully");
		} else {
			System.out.println("The item is not in the cart");
		}

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

}
