package com.globant.topic1.exercise1.model;

public class Email {
	// Final Fields
	private static final String MANAGER_EMAIL = "manager@email.com";
	private static final String FROM_SERVICE_EMAIL = "notifyEmailService@email.com";

	// Private instance Field
	private String subject;
	private String body;
	private String from;
	private String to;

	// Constructor
	public Email(String from, String to, String subject, String body) {
		this.subject = subject;
		this.from = from;
		this.to = to;
		this.from = from;
		this.body = body;
	}

	// Getters and Setters
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public static String getManagerEmail() {
		return MANAGER_EMAIL;
	}

	public static String getFromServiceEmail() {
		return FROM_SERVICE_EMAIL;
	}

	public String getBody() {
		return body;
	}

	public void setMessage(String body) {
		this.body = body;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	// Methods that return a subject according to the operation
	public static String getAddItemSubject() {
		return "An item was added";
	}

	public static String getAddOfferSubject() {
		return "An offer was added";
	}

	public static String getPriceChangedSubject() {
		return "The price of a product was changed";
	}

	public static String getNewTransactionSubject() {
		return "A transaction has been completed";
	}

	public static String getAddItemMessage(String productName) {
		return "An item " + productName + " was added";
	}

	public static String getAddOfferMessage(String offerName) {
		return "The offer " + offerName + " was added";
	}

	public static String getPriceChangedMessage(String productName, double price) {
		return "The price of the product " + productName + " was changed, the new price is: " + price;
	}

	public static String getNewTransactionMessage(int id) {
		return "The transaction number " + id + " has been completed";
	}

	// ToString
	@Override
	public String toString() {
		return "Email Sended from: " + from + ", to: " + to + ", subject: " + subject + ", body: " + body;
	}

}
