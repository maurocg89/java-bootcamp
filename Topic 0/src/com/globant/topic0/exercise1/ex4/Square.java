package com.globant.topic0.exercise1.ex4;

public class Square extends Rectangle {

	// Constructors
	public Square() {
		super();
	}

	public Square(double side) {
		super(side, side);
	}

	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	@Override
	public void setLength(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	@Override
	public void setWidth(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	@Override
	public String toString() {
		return "A Square with side = " + super.getWidth() + ", which is a subclass of "
				+ super.toString();
	}
}
