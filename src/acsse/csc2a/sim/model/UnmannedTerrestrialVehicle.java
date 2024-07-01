package acsse.csc2a.sim.model;

import acsse.csc2a.sim.factory.ITerrestrialVehicle;

public class UnmannedTerrestrialVehicle implements ITerrestrialVehicle {

	@Override
	public void drive() {
		System.out.println("UNMANNED Terrestrial Vehicle is driving.");
	}

}
