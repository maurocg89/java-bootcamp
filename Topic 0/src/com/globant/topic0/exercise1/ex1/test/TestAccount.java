package com.globant.topic0.exercise1.ex1.test;

import com.globant.topic0.exercise1.ex1.Account;

public class TestAccount {
	public static void main(String[] args) {
		Account ac1 = new Account("001", "Account 1", 1000);
		Account ac2 = new Account("002", "Account 2", 2000);
		System.out.println(ac1.credit(100));
		System.out.println(ac1.debit(100));
		System.out.println(ac1.transferTo(ac2, 1000));
	}
}
