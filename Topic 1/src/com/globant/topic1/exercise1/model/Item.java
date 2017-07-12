package com.globant.topic1.exercise1.model;

// Class that represent a cart item
public class Item {
	
	// Fields
	private Product product;
	private int quantity;
	
	// Constructor
	public Item(Product product, int quantity){
		this.product = product;
		this.quantity = quantity;
	}
	
	// Getters and Setters
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	// hashCode, equals and toString
	
	@Override
	public String toString() {
		return "Item [ Product = " + product + ", Quantity = " + quantity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		return true;
	}
	
	
}
