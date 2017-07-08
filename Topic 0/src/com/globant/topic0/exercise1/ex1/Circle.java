package com.globant.topic0.exercise1.ex1;

public class Circle {

	// Fields
	private double radius;
	private String color;

	// Constructors
	public Circle() {
		this.radius = 1.0;
		this.color = "red";
	}

	public Circle(double radius) {
		this.radius = radius;
		this.color = "red";
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	// Method for computing the area of circle
	public double getArea() {
		return radius * radius * Math.PI;
	}

	// Getters and Setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Circle[radius=" + radius + " color=" + color + "]";
	}

}
