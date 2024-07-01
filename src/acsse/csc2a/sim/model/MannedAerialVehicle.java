package acsse.csc2a.sim.model;

import acsse.csc2a.sim.factory.IAerialVehicle;

public class MannedAerialVehicle implements IAerialVehicle{
	
	
	@Override
	public void fly() {
		System.out.println("MANNED Aerial Vehicle is flying.");
	}

}
