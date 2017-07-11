package com.globant.topic0.exercise3.test;

import java.util.Scanner;

import com.globant.topic0.exercise3.factories.HospitalFactory;
import com.globant.topic0.exercise3.model.Hospital;

public class TestHospital {

	public static void main(String[] args) {
		Hospital hospital = createHospital();
		if (hospital != null) {
			System.out.println(hospital);
		}
	}

	public static Hospital createHospital() {
		Scanner userInput = new Scanner(System.in);
		String hospitalType = "";
		int numberOfRooms = 0;
		int numberOfEmployees = 0;

		System.out.println("What type of hospital do you want to create? (public / private): ");
		if (userInput.hasNextLine()) {
			hospitalType = userInput.nextLine();
		}

		System.out.println("Enter the number of rooms for the hospital: ");
		if (userInput.hasNextLine()) {
			numberOfRooms = Integer.parseInt(userInput.nextLine());
		}

		System.out.println("Enter the number of employees for the hospital: ");
		if (userInput.hasNextLine()) {
			numberOfEmployees = Integer.parseInt(userInput.nextLine());
		}

		userInput.close();

		HospitalFactory hf = new HospitalFactory();
		Hospital hospital = hf.getHospital(hospitalType, numberOfRooms, numberOfEmployees);
		return hospital;

	}

}
