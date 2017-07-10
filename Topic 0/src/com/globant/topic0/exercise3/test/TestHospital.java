package com.globant.topic0.exercise3.test;

import com.globant.topic0.exercise3.factories.HospitalFactory;
import com.globant.topic0.exercise3.model.Hospital;

public class TestHospital {
	public static void main(String[] args) {

		HospitalFactory hf = new HospitalFactory();
		Hospital hospital = hf.getHospital("public");
		System.out.println(hospital.getType());
		System.out.println(hospital.getNumberOfEmployees());
		System.out.println(hospital.getRooms());
		
		Hospital hospital2 = hf.getHospital("private");
		System.out.println(hospital2);
		System.out.println(hospital2.getType());
		System.out.println(hospital2.getNumberOfEmployees());
		System.out.println(hospital2.getRooms());

	}
}
