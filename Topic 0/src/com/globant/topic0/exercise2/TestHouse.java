package com.globant.topic0.exercise2;

import com.globant.topic0.exercise2.House.HouseBuilder;

public class TestHouse {
	public static void main(String[] args) {
		House countryHouse = new HouseBuilder()
				.addSurface(200)
				.addRooms(8)
				.addBathrooms(2)
				.addFloors(2)
				.addGarage(true)
				.addYard(true)
				.build();
		System.out.println(countryHouse);

	}
}
