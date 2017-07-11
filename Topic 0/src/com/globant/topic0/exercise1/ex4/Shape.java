package com.globant.topic0.exercise1.ex4;

public class Shape {

	// Fields
	private String color;
	private boolean filled;

	// Constructors
	public Shape() {
		this.color = "red";
		this.filled = true;
	}

	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	// Getters and Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		String sFilled = "";
		if (filled) {
			sFilled = "filed";
		} else {
			sFilled = "Not filled";
		}
		return "A Shape with color of " + color + " and " + sFilled;
	}

}
