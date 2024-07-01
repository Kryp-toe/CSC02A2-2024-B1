package acsse.csc2a.sim.concrete;

import acsse.csc2a.sim.factory.IAerialVehicle;
import acsse.csc2a.sim.factory.IAquaticVehicle;
import acsse.csc2a.sim.factory.IOperatorFactory;
import acsse.csc2a.sim.factory.ITerrestrialVehicle;
import acsse.csc2a.sim.model.UnmannedAerialVehicle;
import acsse.csc2a.sim.model.UnmannedAquaticVehicle;
import acsse.csc2a.sim.model.UnmannedTerrestrialVehicle;

public class UnmannedFactory implements IOperatorFactory{

	@Override
	public IAerialVehicle createAerialVehicle() {
		return new UnmannedAerialVehicle();
	}

	@Override
	public IAquaticVehicle createAquaticVehicle() {
		return new UnmannedAquaticVehicle();
	}

	@Override
	public ITerrestrialVehicle createTerrestrialVehicle() {
		return new UnmannedTerrestrialVehicle();
	}
}
