package com.globant.topic0.exercise1.ex1;

public class Rectangle {
	// Fields
	private float length;
	private float width;

	// Constructors
	public Rectangle() {
		this.length = 1.0f;
		this.width = 1.0f;
	}

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	// Getters and Setters
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	// Methods for computing the area and perimeter of the rectangle
	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return 2 * (length + width);
	}

	@Override
	public String toString() {
		return "Rectangle [length = " + length + ", width = " + width + "]";
	}

}
