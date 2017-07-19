package com.globant.topic1.exercise1.model;

import com.globant.topic1.exercise1.services.SendEmailService;

public class Product {

	// Fields
	private int id;
	private double price;
	private String name;
	private String description;

	// Constructor
	public Product(int id, double price, String name, String description) {
		this.id = id;
		this.price = price;
		this.name = name;
		this.description = description;
		SendEmailService.Send(new Email(Email.getFromServiceEmail(), Email.getManagerEmail(),
				Email.getAddItemSubject(), Email.getAddItemMessage(name)));
	}

	// Getters and Setters
	public int getIdProduct() {
		return id;
	}

	public void setIdProduct(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		SendEmailService.Send(new Email(Email.getFromServiceEmail(), Email.getManagerEmail(),
				Email.getPriceChangedSubject(), Email.getPriceChangedMessage(name, price)));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	// End of Getters and Setters

	// toString, hashCode and equals
	@Override
	public String toString() {
		return " Name = " + name + ", Price = $" + price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
