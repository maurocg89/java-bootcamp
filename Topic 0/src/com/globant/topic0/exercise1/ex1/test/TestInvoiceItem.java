package com.globant.topic0.exercise1.ex1.test;

import com.globant.topic0.exercise1.ex1.InvoiceItem;

public class TestInvoiceItem {
	public static void main(String[] args) {

		InvoiceItem it1 = new InvoiceItem("it-01", "desc", 10, 20.0);
		System.out.println(it1);
		System.out.println("Total price: " + it1.getTotal());

	}
}
