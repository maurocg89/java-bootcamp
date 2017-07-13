package com.globant.topic1.exercise1.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Clase mail con destinatario origen y asunto, y servicio que tenga metodo send que tire un syso avisando que se envio al destinatario

public class Cart {

	// Fields
	private List<Item> items;

	// Constructor
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
	
	public Item getCheaperItem() {
		Comparator<Item> comparatorItem = (item1,
				item2) -> item1.getProduct().getPrice() < item2.getProduct().getPrice() ? 1 : -1;
		return items.stream().max(comparatorItem).orElse(null);

	}

	public Item getMostExpensiveItem() {
		Comparator<Item> comparatorItem = (item1,
				item2) -> item1.getProduct().getPrice() > item2.getProduct().getPrice() ? 1 : -1;
		return items.stream().max(comparatorItem).orElse(null);
	}

}
