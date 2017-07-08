package com.globant.topic0.exercise1.ex1.test;

import com.globant.topic0.exercise1.ex1.Rectangle;

public class TestRectangle {
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(5.0f, 6.0f);
		
		System.out.println(r1);
		System.out.println("The rectangle has area of " + r1.getArea() + " and perimeter of " + r1.getPerimeter());
		
		System.out.println(r2);
		System.out.println("The rectangle has area of " + r2.getArea() + " and perimeter of " + r2.getPerimeter());
		
	}
}
