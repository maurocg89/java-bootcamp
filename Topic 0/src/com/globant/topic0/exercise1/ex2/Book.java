package com.globant.topic0.exercise1.ex2;

import java.util.Arrays;

public class Book {

	// Fields
	private String name;
	private Author[] authors;
	private double price;
	private int qty;

	// Constructors
	public Book(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = 0;
	}

	public Book(String name, Author[] authors, double price, int qty) {
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

	public Author[] getAuthors() {
		return authors;
	}

	@Override
	public String toString() {
		return "Book [name = " + name + ", authors = {" + Arrays.toString(authors) + "}, price = " + price + ", qty = "
				+ qty + "]";
	}

	// Method to get the names of the authors
	public String getAuthorNames() {
		String authorNames = "";
		for (int i = 0; i < authors.length; i++) {
			/*if (i == authors.length - 1) {
				authorNames += authors[i].getName();
			} else {
				authorNames += authors[i].getName() + ", ";
			}*/
			authorNames += authors[i].getName() + ", ";
		}
		return authorNames.substring(0, authorNames.lastIndexOf(","));
	}

}
