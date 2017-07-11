package com.globant.topic0.exercise1.ex2;

public class Author {

	// Fields
	private String name;
	private String email;
	private char gender;

	// Constructor
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender; // input validation?
	}

	// Getters and Setters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Author [name = " + name + ", email = " + email + ", gender = " + gender + "]";
	}

}
