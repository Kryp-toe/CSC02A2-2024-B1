package acsse.csc2a.sim.model;

import acsse.csc2a.sim.factory.IAerialVehicle;

public class UnmannedAerialVehicle implements IAerialVehicle {

	@Override
	public void fly() {
		System.out.println("UNMANNED Aerial Vehicle is flying.");
	}

}
