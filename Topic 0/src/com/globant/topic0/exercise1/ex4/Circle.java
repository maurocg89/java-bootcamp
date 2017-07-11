package com.globant.topic0.exercise1.ex4;

public class Circle extends Shape {

	// Fields
	private double radius;

	// Constructors
	public Circle() {
		super();
		this.radius = 1.0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	// Getters and Setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "A Circle with radius = " + radius + ", which is a subclass of " + super.toString();
	}

}
