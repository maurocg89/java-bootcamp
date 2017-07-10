package com.globant.topic0.exercise3.model;

public abstract class Hospital {

	// Abstract method
	public abstract String getType(); // private or public Hospital

	// Fields
	private int numberOfEmployees;
	private int rooms;
	
	// Getters and Setters
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "Hospital [ type = " + getType() + ", number of employees = " + numberOfEmployees + ", rooms = " + rooms
				+ "]";
	}

}
