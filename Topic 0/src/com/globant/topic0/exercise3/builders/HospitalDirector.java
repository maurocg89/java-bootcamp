package com.globant.topic0.exercise3.builders;

import com.globant.topic0.exercise3.model.Hospital;

// Class that is responsible for constructing a Hospital

public class HospitalDirector {

	private HospitalBuilder hospitalBuilder = null;

	public HospitalDirector(HospitalBuilder hospitalBuilder) {
		this.hospitalBuilder = hospitalBuilder;
	}

	public Hospital constructHospital(int rooms, int employees) {
		hospitalBuilder.buildNumberOfEmployees(employees);
		hospitalBuilder.buildRooms(rooms);
		Hospital hospital = hospitalBuilder.getHospital();

		return hospital;

	}

	public Hospital getHospital() {
		return hospitalBuilder.getHospital();
	}
}
