package com.globant.topic0.exercise3.builders;

import com.globant.topic0.exercise3.model.Hospital;

public abstract class HospitalBuilder {

	public abstract Hospital getHospital();

	public abstract void buildRooms(int rooms);

	public abstract void buildNumberOfEmployees(int employees);

}
