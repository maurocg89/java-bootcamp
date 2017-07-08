package com.globant.topic0.exercise1.ex2.test;

import com.globant.topic0.exercise1.ex2.MyPoint;

public class TestMyPoint {
	public static void main(String[] args) {
		// Testing getters and setters
		MyPoint p1 = new MyPoint();
		System.out.println(p1);
		p1.setX(8);
		p1.setY(6);
		System.out.println("x: " + p1.getX() + ", y: " + p1.getY());
		p1.setXY(5, 7);
		System.out.println(p1.getXY()[0]);
		System.out.println(p1.getXY()[1]);

		// Testing distance() methods
		MyPoint p2 = new MyPoint(7, 5);
		System.out.println(p1.distance());
		System.out.println(p1.distance(p2));
		System.out.println(p2.distance(2, 3));
		
		// Testing array of MyPoints
		MyPoint[] points = new MyPoint[10];
		for (int i = 0; i < points.length; i++) {
			points[i] = new MyPoint(i + 1, i + 1);
		}
		for (int i = 0; i < points.length; i++) {
			System.out.println(points[i]);
		}
	}
}
