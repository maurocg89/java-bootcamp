package com.globant.topic0.exercise1.ex2;

import java.text.DecimalFormat;

public class Account {

	// Fields
	private int id;
	private Customer customer;
	private double balance;

	// Constructors
	public Account(int id, Customer customer, double balance) {
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}

	public Account(int id, Customer customer) {
		this.id = id;
		this.customer = customer;
		this.balance = 0.0;
	}

	// Getters and Setters
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public String getCustomerName() {
		return customer.getName();
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#0.00");
		return customer + " balance = $" + df.format(balance);
	}

	public Account deposit(double amount) {
		balance += amount;
		return this;
	}

	public Account withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("amount withdrawn exceeds the current balance!");
		}
		return this;
	}

}
