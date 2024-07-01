package acsse.csc2a.sim.model;

import acsse.csc2a.sim.factory.IAquaticVehicle;

public class UnmannedAquaticVehicle implements IAquaticVehicle {

	@Override
	public void sail() {
		System.out.println("UNMANNED Aquatic Vehicle is sailing.");
	}

}
