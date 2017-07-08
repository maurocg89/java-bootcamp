package com.globant.topic0.exercise1.ex2;

public class MyCircle {

	// Fields
	private MyPoint center;
	private int radius;

	// Constructors
	public MyCircle() {
		this.center = new MyPoint();
		this.radius = 1;
	}

	public MyCircle(int x, int y, int radius) {
		this.center = new MyPoint(x, y);
		this.radius = radius;
	}

	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	// Getters and Setters
	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getCenterX() {
		return center.getX();
	}

	public void setCenterX(int x) {
		this.center.setX(x);
	}

	public int getCentery() {
		return center.getY();
	}

	public void setCenterY(int y) {
		this.center.setY(y);
	}

	public int[] getCenterXY() {
		return center.getXY();
	}

	public void setCenterXY(int x, int y) {
		this.center.setXY(x, y);
	}

	@Override
	public String toString() {
		return "MyCircle[radius = " + radius + ", center = " + center + "]";
	}

	// Method for computing the area of circle
	public double getArea() {
		return radius * radius * Math.PI;
	}

	// Method for computing the circumference of circle
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	// Methods that returns the distance between the centers of two circles
	public double distance(MyCircle another) {
		return center.distance(another.center);
	}
}
