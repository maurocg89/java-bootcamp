package com.globant.topic0.exercise2;

public class House {

	// Fields
	private double surface; // m2
	private int rooms;
	private int bathrooms;
	private int floors;
	private boolean garage;
	private boolean yard;

	// Getters and Setters
	public double getSurface() {
		return surface;
	}

	public void setSurface(double surface) {
		this.surface = surface;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public int getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	public boolean isYard() {
		return yard;
	}

	public void setYard(boolean yard) {
		this.yard = yard;
	}

	@Override
	public String toString() {
		return "surface = " + surface + " m2, rooms = " + rooms + ", bathrooms = " + bathrooms + ", floors = "
				+ floors + ", garage = " + garage + ", yard = " + yard;
	}

}
