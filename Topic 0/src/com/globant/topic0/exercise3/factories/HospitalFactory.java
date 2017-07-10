package com.globant.topic0.exercise3.factories;

import com.globant.topic0.exercise3.builders.HospitalBuilder;
import com.globant.topic0.exercise3.builders.HospitalDirector;
import com.globant.topic0.exercise3.builders.PrivateHospitalBuilder;
import com.globant.topic0.exercise3.builders.PublicHospitalBuilder;
import com.globant.topic0.exercise3.model.Hospital;

// Factory class that return a different type of hospital based on the data input

public class HospitalFactory {

	public Hospital getHospital(String type) {
		HospitalBuilder hospitalBuilder;
		HospitalDirector hospitalDirector;
		switch (type.toLowerCase()) {
		case "public":
			hospitalBuilder = new PublicHospitalBuilder();
			hospitalDirector = new HospitalDirector(hospitalBuilder);
			return hospitalDirector.constructHospital();
		case "private":
			hospitalBuilder = new PrivateHospitalBuilder();
			hospitalDirector = new HospitalDirector(hospitalBuilder);
			return hospitalDirector.constructHospital();
		default:
			return null;
		}
	}

}
