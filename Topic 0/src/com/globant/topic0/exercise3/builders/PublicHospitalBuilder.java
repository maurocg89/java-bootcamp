package com.globant.topic0.exercise3.builders;

import com.globant.topic0.exercise3.model.Hospital;
import com.globant.topic0.exercise3.model.PublicHospital;

// Concrete Builder, is responsible for creating and assembling a Hospital object

public class PublicHospitalBuilder extends HospitalBuilder {

	private PublicHospital publicHospital;

	public PublicHospitalBuilder() {
		publicHospital = new PublicHospital();
	}

	@Override
	public Hospital getHospital() {
		return publicHospital;
	}

	@Override
	public void buildRooms() {
		publicHospital.setRooms(50);
	}

	@Override
	public void buildNumberOfEmployees() {
		publicHospital.setNumberOfEmployees(200);
	}

}
