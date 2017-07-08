package com.globant.topic0.exercise1.ex5.test;

import com.globant.topic0.exercise1.ex5.Line;
import com.globant.topic0.exercise1.ex5.LineSub;
import com.globant.topic0.exercise1.ex5.Point;

public class TestLine {
	public static void main(String[] args) {
		Line l1 = new Line(0, 0, 3, 4);
		System.out.println(l1);
		
		Point p1 = new Point(0,0);
		Point p2 = new Point(5,7);
		Line l2 = new Line(p1,p2);
		System.out.println(l2.getGradient());
		System.out.println(l2.getLength());
		
		// Testing LineSub
		LineSub ls1 = new LineSub(0,0,3,4);
		System.out.println(ls1);
		
		Line ls2 = new Line(p1,p2);
		System.out.println(ls2.getGradient());
		System.out.println(ls2.getLength());
	}
}
