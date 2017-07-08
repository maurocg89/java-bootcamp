package com.globant.topic0.exercise1.ex4.test;

import com.globant.topic0.exercise1.ex4.Circle;
import com.globant.topic0.exercise1.ex4.Rectangle;
import com.globant.topic0.exercise1.ex4.Shape;
import com.globant.topic0.exercise1.ex4.Square;

public class TestShape {
	public static void main(String[] args) {

		Shape shape = new Shape();
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		Square square = new Square();
		
		System.out.println(shape);
		System.out.println(circle);
		System.out.println(rectangle);
		System.out.println(square);
		System.out.println(square.getPerimeter());
		square.setLength(5);
		System.out.println(square);
		System.out.println(square.getPerimeter());
		
	}

}
