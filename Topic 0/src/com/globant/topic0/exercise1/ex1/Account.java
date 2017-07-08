package com.globant.topic0.exercise1.ex1;

public class Account {

	// Fields
	private String id;
	private String name;
	private int balance;

	// Constructors
	public Account(String id, String name) {
		this.id = id;
		this.name = name;
		this.balance = 0;
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	// Getters
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	// Add amount to balance and return the new balance
	public int credit(int amount) {
		return balance += amount;
	}

	// Subtract amount from balance and return the new balance
	public int debit(int amount) {
		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}

	// Transfer amount to another account and return the new balance
	public int transferTo(Account another, int amount) {
		if (amount <= balance) {
			another.balance += amount;
			balance -= amount;
		} else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}

	@Override
	public String toString() {
		return "Account [id = " + id + ", name = " + name + ", balance = " + balance + "]";
	}

}
