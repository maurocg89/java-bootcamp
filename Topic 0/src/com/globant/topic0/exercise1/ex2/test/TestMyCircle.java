package com.globant.topic0.exercise1.ex2.test;

import com.globant.topic0.exercise1.ex2.MyCircle;
import com.globant.topic0.exercise1.ex2.MyPoint;

public class TestMyCircle {
	public static void main(String[] args) {
		MyPoint point1 = new MyPoint(4, 5);
		MyCircle circle1 = new MyCircle(point1, 8);
		System.out.println(circle1);
		System.out.println("Circumference: " + circle1.getCircumference());
		System.out.println(circle1.getCenterXY()[0]);
		System.out.println(circle1.getCenterXY()[1]);

		MyPoint point2 = new MyPoint(7, 8);
		MyCircle circle2 = new MyCircle(point2, 12);
		System.out.println("Distance between the centers of the circles: " + circle1.distance(circle2));
	}
}
