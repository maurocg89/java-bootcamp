package com.globant.topic0.exercise1.ex4;

public class Rectangle extends Shape {

	// Fields
	private double width;
	private double length;

	// Constructors
	public Rectangle() {
		width = 1.0;
		width = 1.0;
	}

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	// Getters and Setters
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return 2 * (length + width);
	}

	public String toString() {
		return "A Rectangle with width = " + width + " and length = " + length + ", which is a subclass of "
				+ super.toString();
	}
}
