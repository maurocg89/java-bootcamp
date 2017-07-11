package com.globant.topic0.exercise1.ex6.test;

import com.globant.topic0.exercise1.ex6.Movable;
import com.globant.topic0.exercise1.ex6.MovableCircle;
import com.globant.topic0.exercise1.ex6.MovablePoint;
import com.globant.topic0.exercise1.ex6.MovableRectangle;

public class TestMovable {
	public static void main(String[] args) {
		Movable m1 = new MovablePoint(5, 6, 10, 15);
		System.out.println(m1);
		m1.moveRight();
		System.out.println(m1);
		
		Movable m2 = new MovableCircle(1, 2, 3, 4, 10);
		System.out.println(m2);
		m2.moveUp();
		System.out.println(m2);
		
		Movable m3 = new MovableRectangle(4, 8, 7, 3, 2, 2);
		System.out.println(m3);
		m3.moveDown();
		System.out.println(m3);
	}
}
