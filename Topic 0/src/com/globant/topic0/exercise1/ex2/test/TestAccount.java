package com.globant.topic0.exercise1.ex2.test;

import com.globant.topic0.exercise1.ex2.Account;
import com.globant.topic0.exercise1.ex2.Customer;

public class TestAccount {
	public static void main(String[] args) {
		Customer customer = new Customer(1, "Mauro Grillo", 'm');
		Account acc1 = new Account(1, customer, 1000.5234);
		System.out.println(acc1);
		System.out.println(acc1.getCustomerName());
		System.out.println(acc1.withdraw(800));
		System.out.println(acc1.withdraw(300));
		System.out.println(acc1.deposit(120));
	}
}
