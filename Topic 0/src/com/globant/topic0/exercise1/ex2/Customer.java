package com.globant.topic0.exercise1.ex2;

public class Customer {

	// Fields
	private int id;
	private String name;
	private char gender;

	// Constructor
	public Customer(int id, String name, char gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return name + "(" + id + ")";
	}

}
