package com.globant.topic0.exercise1.ex1.test;

import com.globant.topic0.exercise1.ex1.Circle;
import com.globant.topic0.exercise1.ex1.SimplifiedCircle;

public class TestCircle {

	public static void main(String[] args) {

		Circle c1 = new Circle();
		System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());

		Circle c2 = new Circle(2.0);
		System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());

		// 1.Constructor and 2.Getter
		Circle c3 = new Circle(3.0, "blue");
		System.out.println("The circle has radius of " + c3.getRadius() + " and area of " + c2.getArea()
				+ ", the color of the circle is " + c3.getColor());

		// 4.Setter
		Circle c4 = new Circle();
		c4.setRadius(5.0);
		System.out.println("radius is: " + c4.getRadius());
		c4.setColor("green");
		System.out.println("color is: " + c4.getColor());

		// 6.Method toString()
		Circle c5 = new Circle(4.0);
		System.out.println(c5.toString()); // explicit call
		System.out.println(c5); // implicit call
		System.out.println("Operator '+' invokes toString() too: " + c5); // '+'
																			// invokes
																			// toString()
																			// too
		// Testing SimplifiedCircle
		SimplifiedCircle sc1 = new SimplifiedCircle();
		System.out.println(
				"The circle has radius of " + sc1.getRadius() + " and circumference of " + sc1.getCircumference());
		System.out.println(sc1);

		SimplifiedCircle sc2 = new SimplifiedCircle(2.0);
		System.out.println(
				"The circle has radius of " + sc2.getRadius() + " and circumference of " + sc2.getCircumference());
		System.out.println(sc2);
		
	}
}
