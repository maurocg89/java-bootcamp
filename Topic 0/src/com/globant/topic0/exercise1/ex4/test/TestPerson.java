package com.globant.topic0.exercise1.ex4.test;

import com.globant.topic0.exercise1.ex4.Staff;
import com.globant.topic0.exercise1.ex4.Student;

public class TestPerson {
	public static void main(String[] args) {

		Student st1 = new Student("Mauro Grillo", "fake st. 123", "program", 2017, 100.0);
		System.out.println(st1);
		
		Staff staff1 = new Staff("John Doe", "staff st. 321", "School", 15000);
		System.out.println(staff1);
	}
}
