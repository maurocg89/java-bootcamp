package com.globant.topic0.exercise1.ex1.test;

import com.globant.topic0.exercise1.ex1.Employee;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(0, "Mauro", "Grillo", 100);
		System.out.println(e1.toString());
		System.out.println(
				"Salary before raise: " + e1.getSalary() + ", salary after a 20% raise: " + e1.raiseSalary(20));
		System.out.println("Annual salary: " + e1.getAnnualSalary());
		
	}
}
