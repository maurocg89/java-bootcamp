package com.globant.topic0.exercise3.builders;

import com.globant.topic0.exercise3.model.Hospital;
import com.globant.topic0.exercise3.model.PrivateHospital;

// Concrete Builder, is responsible for creating and assembling a Hospital object

public class PrivateHospitalBuilder extends HospitalBuilder {
	
	private PrivateHospital privateHospital;
	
	public PrivateHospitalBuilder(){
		privateHospital = new PrivateHospital();
	}
	
	@Override
	public Hospital getHospital() {
		return privateHospital;
	}

	@Override
	public void buildRooms() {
		privateHospital.setRooms(20);
	}

	@Override
	public void buildNumberOfEmployees() {
		privateHospital.setNumberOfEmployees(50);
	}
	
}
