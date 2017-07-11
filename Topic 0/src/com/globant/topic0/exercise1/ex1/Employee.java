package com.globant.topic0.exercise1.ex1;

public class Employee {

	// Fields
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	// Constructor
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	// Getters and Setters
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	// Method to calculate the annual salary
	public int getAnnualSalary() {
		return salary * 12;
	}

	// Method to raise the salary by a percent and return the new salary
	public int raiseSalary(int percent) {
		int newSalary = salary + (salary * percent / 100);
		this.setSalary(newSalary);
		return newSalary;
	}

	@Override
	public String toString() {
		return "Employee [id = " + id + ", name = " + firstName + " " + lastName + ", salary = " + salary + "]";
	}

}
