package com.globant.topic0.exercise2;

public class HouseDirector {

	private HouseBuilder houseBuilder = null;

	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public void constructHouse() {
		houseBuilder.buildSurface();
		houseBuilder.buildRooms();
		houseBuilder.buildBathrooms();
		houseBuilder.buildFloors();
		houseBuilder.buildGarage();
		houseBuilder.buildYard();
	}

	public House getHouse() {
		return houseBuilder.getHouse();
	}
}
