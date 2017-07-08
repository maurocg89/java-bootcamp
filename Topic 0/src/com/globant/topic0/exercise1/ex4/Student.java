package com.globant.topic0.exercise1.ex4;

public class Student extends Person {

	// Fields
	private String program;
	private int year;
	private double fee;

	// Constructor
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	// Getters and Setters
	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [Person [name = " + getName() + ", address = " + getAddress() + "], program = " + program
				+ ", year = " + year + ", fee = " + fee + "]";
	}

}
