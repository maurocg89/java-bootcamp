package com.globant.topic0.exercise1.ex5;

public class LineSub extends Point {
	// A line needs two points: begin and end.
	// The begin point is inherited from its superclass Point.
	// Fields
	private Point end;

	// Constructors
	public LineSub(int beginX, int beginY, int endX, int endY) {
		super(beginX, beginY);
		this.end = new Point(endX, endY);
	}

	public LineSub(Point begin, Point end) {
		super(begin.getX(), begin.getY());
		this.end = end;
	}

	public Point getBegin() {
		return new Point(super.getX(), super.getY());
	}

	public Point getEnd() {
		return end;
	}

	public void setBegin(int beginX, int beginY) {
		super.setXY(beginX, beginY);
	}

	public void setEnd(int endX, int endY) {
		end.setXY(endX, endY);
	}

	public int getBeginX() {
		return super.getX();
	}

	public int getBeginY() {
		return super.getY();
	}

	public int getEndX() {
		return end.getX();
	}

	public int getEndY() {
		return end.getY();
	}

	public void setBeginX(int beginX) {
		super.setX(beginX);
	}

	public void setBeginY(int beginY) {
		super.setY(beginY);
	}

	public void setEndX(int endX) {
		end.setX(endX);
	}

	public void setEndY(int endY) {
		end.setY(endY);
	}

	// Length of the line
	public int getLength() {
		int xDiff = end.getX() - super.getX();
		int yDiff = end.getY() - super.getY();
		return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}

	// Gradient in radians
	public double getGradient() {
		int xDiff = end.getX() - super.getX();
		int yDiff = end.getY() - super.getY();
		return Math.atan2(yDiff, xDiff);
	}

	@Override
	public String toString() {
		return "LineSub [begin=" + super.toString() + ", end=" + end + "]";
	}

}
