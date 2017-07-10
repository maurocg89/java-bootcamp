package com.globant.topic0.exercise2;

public class House {

	// Required parameters
	private final double surface; // m2
	private final int rooms;
	private final int bathrooms;
	private final int floors;
	
	// Optional parameters
	private boolean garage;
	private boolean yard;

	// Private construct that use the builder
	private House(HouseBuilder builder) {
		this.surface = builder.surface;
		this.rooms = builder.rooms;
		this.bathrooms = builder.bathrooms;
		this.floors = builder.floors;
		this.garage = builder.garage;
		this.yard = builder.yard;
	}

	// Getters
	public double getSurface() {
		return surface;
	}

	public int getRooms() {
		return rooms;
	}

	public int getBathrooms() {
		return bathrooms;
	}

	public int getFloors() {
		return floors;
	}

	public boolean isGarage() {
		return garage;
	}

	public boolean isYard() {
		return yard;
	}

	@Override
	public String toString() {
		return "House [surface = " + surface + " m2, rooms = " + rooms + ", bathrooms = " + bathrooms + ", floors = " + floors
				+ ", garage = " + garage + ", yard = " + yard + "]";
	}

	// Builder class to create houses with differents attributes
	public static class HouseBuilder {
		private double surface; // m2
		private int rooms;
		private int bathrooms;
		private int floors;
		private boolean garage;
		private boolean yard;

		public HouseBuilder addSurface(double surface) {
			this.surface = surface;
			return this;
		}

		public HouseBuilder addRooms(int rooms) {
			this.rooms = rooms;
			return this;
		}

		public HouseBuilder addBathrooms(int bathrooms) {
			this.bathrooms = bathrooms;
			return this;
		}

		public HouseBuilder addFloors(int floors) {
			this.floors = floors;
			return this;
		}

		public HouseBuilder addGarage(boolean garage) {
			this.garage = garage;
			return this;
		}

		public HouseBuilder addYard(boolean yard) {
			this.yard = yard;
			return this;
		}

		public House build() {
			House house = new House(this);
			if (surface < 40) {
				throw new IllegalStateException("The minimum surface area of a house is 40 m2");
			}
			if (rooms < 1) {
				throw new IllegalStateException("The number of rooms cannot be less than 1");
			}
			if (bathrooms < 1) {
				throw new IllegalStateException("The number of bathrooms cannot be less than 1");
			}
			if (floors < 1) {
				throw new IllegalStateException("The number of floors cannot be less than 1");
			}
			return house;
		}
	}

}
