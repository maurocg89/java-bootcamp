package com.globant.topic0.exercise1.ex1;

public class Date {

	// Fields
	private int day;
	private int month;
	private int year;

	// Constructor
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// Getters and Setters

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		String sDay = String.valueOf(day);
		String sMonth = String.valueOf(month);
		if (day < 10) {
			sDay = "0" + day;
		}
		if (month < 10) {
			sMonth = "0" + month;
		}

		return sDay + "/" + sMonth + "/" + year;
	}

}
