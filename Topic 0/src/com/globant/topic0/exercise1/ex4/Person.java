package com.globant.topic0.exercise1.ex4;

public class Person {

	// Fields
	private String name;
	private String address;

	// Constructor
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

}
