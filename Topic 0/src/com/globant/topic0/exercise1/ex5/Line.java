package com.globant.topic0.exercise1.ex5;

public class Line {

	// Fields
	private Point begin; // beginning point
	private Point end; // ending point

	// Constructors
	public Line(Point begin, Point end) {
		this.begin = begin;
		this.end = end;
	}

	public Line(int beginX, int beginY, int endX, int endY) {
		begin = new Point(beginX, beginY);
		end = new Point(endX, endY);
	}

	// Getters and Setters
	public Point getBegin() {
		return begin;
	}

	public void setBegin(Point begin) {
		this.begin = begin;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	public int getBeginX() {
		return begin.getX();
	}

	public int getBeginY() {
		return begin.getY();
	}

	public int getEndX() {
		return end.getX();
	}

	public int getEndY() {
		return end.getY();
	}

	public void setBeginX(int beginX) {
		begin.setX(beginX);
	}

	public void setBeginY(int beginY) {
		begin.setY(beginY);
	}

	public void setBeginXY(int beginX, int beginY) {
		begin.setXY(beginX, beginY);
	}

	public void setEndX(int endX) {
		end.setX(endX);
	}

	public void setEndY(int endY) {
		end.setY(endY);
	}

	public void setEndXY(int endX, int endY) {
		end.setXY(endX, endY);
	}

	@Override
	public String toString() {
		return "Line [begin=" + begin + ", end=" + end + "]";
	}

	public int getLength() {
		int xDiff = end.getX() - begin.getX();
		int yDiff = end.getY() - begin.getY();
		return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}

	public double getGradient() {
		int xDiff = end.getX() - begin.getX();
		int yDiff = end.getY() - begin.getY();
		return Math.atan2(yDiff, xDiff);
	}

}
