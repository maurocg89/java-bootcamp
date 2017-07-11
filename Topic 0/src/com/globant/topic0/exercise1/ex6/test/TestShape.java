package com.globant.topic0.exercise1.ex6.test;

import com.globant.topic0.exercise1.ex6.Circle;
import com.globant.topic0.exercise1.ex6.Rectangle;
import com.globant.topic0.exercise1.ex6.Shape;
import com.globant.topic0.exercise1.ex6.Square;

public class TestShape {
	public static void main(String[] args) {
		Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
		System.out.println(s1); // Circle version
		System.out.println(s1.getArea()); // Circle version
		System.out.println(s1.getPerimeter()); // Circle version

		Circle c1 = (Circle) s1; // Downcast back to Circle
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());

		Shape s2 = new Square(3.0); // Upcast
		System.out.println(s2);
		System.out.println(s2.getPerimeter());
		System.out.println(s2.getColor());
		
		// we downcast Shape s2 to Rectangle,
		// which is a superclass of Square, instead of Square
		Rectangle r1 = (Rectangle) s2;
		System.out.println(r1);
		
		// Downcast Rectangle r1 to Square
		Square sq1 = (Square) r1;
		System.out.println(sq1);
		
	}
}
