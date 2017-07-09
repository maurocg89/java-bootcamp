package com.globant.topic0.exercise2;

public class TestHouse {
	public static void main(String[] args) {

		HouseBuilder houseBuilder = new CountryHouse();
		HouseDirector houseDirector = new HouseDirector(houseBuilder);
		houseDirector.constructHouse();
		House house = houseDirector.getHouse();
		System.out.println(house);
	}
}
