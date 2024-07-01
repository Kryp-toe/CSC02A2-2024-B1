package acsse.csc2a.sim.model;

import acsse.csc2a.sim.factory.ITerrestrialVehicle;

public class MannedTerrestrialVehicle implements ITerrestrialVehicle {

	@Override
	public void drive() {
		System.out.println("MANNED Terrestrial Vehicle is driving.");
	}

}
