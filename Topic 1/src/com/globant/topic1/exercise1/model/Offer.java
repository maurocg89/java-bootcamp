package com.globant.topic1.exercise1.model;

import java.util.ArrayList;
import java.util.List;

import com.globant.topic1.exercise1.services.SendEmailService;

public class Offer {

	private List<Product> offers;
	private String name;
	private double discountPercentage = 0.3; // base discount

	public Offer(String name) {
		this.name = name;
		this.offers = new ArrayList<>();
		SendEmailService.Send(new Email(Email.getFromServiceEmail(), Email.getManagerEmail(),
				Email.getAddOfferSubject(), Email.getAddOfferMessage(name)));
	}

	// Getters and Setters
	public List<Product> getOffers() {
		return offers;
	}

	public void setOffer(List<Product> offers) {
		this.offers = offers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	// Total of the products
	public double getTotal() {
		return offers.stream().mapToDouble(p -> p.getPrice()).sum();
	}

	// Price of the offer
	public double getPrice() {
		double total = getTotal();
		return total - (total * discountPercentage);
	}

	// end of Getters and Setters

	public void addProduct(Product product) {
		if (!offers.contains(product)) {
			offers.add(product);
		} else {
			System.out.println("The product " + product.getName() + " is already on offer");
		}
	}

	public void removeProduct(Product product) {
		if (offers.size() == 0) {
			System.out.println("There are no products on the offer: " + this.name);
		} else if (offers.contains(product)) {
			offers.remove(product);
			System.out.println("The product " + product.getName() + " was removed successfully");
		} else {
			System.out.println("The product " + product.getName() + " is not on the offer: " + this.name);
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name);
		sb.append(": $");
		sb.append(getPrice());
		sb.append("\n \t");
		for (Product product : offers) {
			sb.append(product.getName());
			sb.append(": $");
			sb.append(product.getPrice());
			sb.append("\n \t");
		}

		return sb.toString();
	}

}
