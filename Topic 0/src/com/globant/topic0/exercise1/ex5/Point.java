package com.globant.topic0.exercise1.ex5;

public class Point {
	
	// Fields
	private int x;
	private int y;
	
	// Constructor
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	// Getters and Setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point: (" + x + "," + y + ")";
	}


	
	
	
}
