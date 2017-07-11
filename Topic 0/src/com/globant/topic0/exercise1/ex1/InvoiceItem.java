package com.globant.topic0.exercise1.ex1;

public class InvoiceItem {

	// Fields
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;

	// Constructor
	public InvoiceItem(String id, String desc, int qty, double unitPrice) {
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}

	// Getters and Setters
	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getId() {
		return id;
	}

	public String getDesc() {
		return desc;
	}

	// Method to calculate and return the total price
	public double getTotal() {
		return unitPrice * qty;
	}

	@Override
	public String toString() {
		return "InvoiceItem [id = " + id + ", desc = " + desc + ", qty = " + qty + ", unitPrice = " + unitPrice + "]";
	}

}
