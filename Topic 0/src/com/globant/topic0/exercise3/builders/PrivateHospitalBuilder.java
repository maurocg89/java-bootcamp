package com.globant.topic0.exercise3.builders;

import com.globant.topic0.exercise3.model.Hospital;
import com.globant.topic0.exercise3.model.PrivateHospital;

// Concrete Builder, is responsible for creating and assembling a Hospital object

public class PrivateHospitalBuilder extends HospitalBuilder {

	private PrivateHospital privateHospital;

	public PrivateHospitalBuilder() {
		privateHospital = new PrivateHospital();
	}

	@Override
	public Hospital getHospital() {
		return privateHospital;
	}

	@Override
	public void buildRooms(int rooms) {
		privateHospital.setRooms(rooms);
	}

	@Override
	public void buildNumberOfEmployees(int employees) {
		privateHospital.setNumberOfEmployees(employees);
	}

}
