package com.globant.topic0.exercise1.ex2;

import java.util.Arrays;
import java.util.List;

public class Book {

	// Fields
	private String name;
	private List<Author> authors;
	private double price;
	private int qty;

	// Constructors
	public Book(String name, List<Author> authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = 0;
	}

	public Book(String name, List<Author> authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	// Getters and Setters
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	@Override
	public String toString() {
		return "Book [name = " + name + ", authors = {" + authors + "}, price = " + price + ", qty = " + qty + "]";
	}

	// Method to get the names of the authors
	public String getAuthorNames() {
		String authorsNames = "";
		for (Author author : authors) {
			authorsNames += author.getName() + ", ";
		}
		return authorsNames.substring(0, authorsNames.lastIndexOf(","));
	}

}
