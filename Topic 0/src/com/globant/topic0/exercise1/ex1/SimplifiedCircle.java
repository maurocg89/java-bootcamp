package com.globant.topic0.exercise1.ex1;

public class SimplifiedCircle {

	// Fields
	private double radius;

	// Constructors
	public SimplifiedCircle() {
		this.radius = 1.0;
	}

	public SimplifiedCircle(double radius) {
		this.radius = radius;
	}

	// Method for computing the circumference of circle
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	// Getters and Setters
	public double getRadius() {
		return radius;
	}

	public void setRaidus(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "SimplifiedCircle [radius = " + radius + "]";
	}

}
