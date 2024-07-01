package acsse.csc2a.sim.model;

import acsse.csc2a.sim.factory.IAquaticVehicle;

public class MannedAquaticVehicle implements IAquaticVehicle {

	@Override
	public void sail() {
		System.out.println("MANNED Aquatic Vehicle is sailing.");
	}

}
