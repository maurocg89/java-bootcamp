package com.globant.topic1.exercise1.model;

public class Email {
	// Final Fields
	private static final String TO_EMAIL = "manager@email.com";
	private static final String FROM_EMAIL = "notifyEmailService@email.com";

	// Private instance Field
	private String subject;

	// Constructor
	public Email(String subject) {
		this.subject = subject;
	}

	// Getters and Setters
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public static String getToEmail() {
		return TO_EMAIL;
	}

	public static String getFromEmail() {
		return FROM_EMAIL;
	}

	// Methods that return a subject according to the operation
	public static String getAddItemSubject(String productName) {
		return "The item " + productName + " was added";
	}

	public static String getAddOfferSubject(String offerName) {
		return "The offer " + offerName + " was added";
	}

	public static String getPriceChangedSubject(String productName, double price) {
		return "The price of the product " + productName + " was changed, the new price is: " + price;
	}

	public static String getNewTransactionSubject(int id) {
		return "The transaction number " + id + " has been completed";
	}
	
	// ToString
	@Override
	public String toString() {
		return "Email Sended from: " + FROM_EMAIL + ", to: " + TO_EMAIL + ", subject: " + subject;
	}

}
