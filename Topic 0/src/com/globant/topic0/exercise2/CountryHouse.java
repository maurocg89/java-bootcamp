package com.globant.topic0.exercise2;

public class CountryHouse implements HouseBuilder {

	private House house;

	// Constructor that create a house
	public CountryHouse() {
		house = new House();
	}
	
	// Methods to build the parts of the house
	@Override
	public void buildSurface() {
		house.setSurface(200);
	}

	@Override
	public void buildRooms() {
		house.setRooms(8);
	}

	@Override
	public void buildBathrooms() {
		house.setBathrooms(2);
	}

	@Override
	public void buildFloors() {
		house.setFloors(2);
	}

	@Override
	public void buildGarage() {
		house.setGarage(true);
	}

	@Override
	public void buildYard() {
		house.setYard(true);
	}

	@Override
	public House getHouse() {
		return house;
	}

}
