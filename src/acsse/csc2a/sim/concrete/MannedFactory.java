package acsse.csc2a.sim.concrete;

import acsse.csc2a.sim.factory.IAerialVehicle;
import acsse.csc2a.sim.factory.IAquaticVehicle;
import acsse.csc2a.sim.factory.IOperatorFactory;
import acsse.csc2a.sim.factory.ITerrestrialVehicle;
import acsse.csc2a.sim.model.MannedAerialVehicle;
import acsse.csc2a.sim.model.MannedAquaticVehicle;
import acsse.csc2a.sim.model.MannedTerrestrialVehicle;

public class MannedFactory implements IOperatorFactory{

	@Override
	public IAerialVehicle createAerialVehicle() {
		return new MannedAerialVehicle();
	}

	@Override
	public IAquaticVehicle createAquaticVehicle() {
		return new MannedAquaticVehicle();
	}

	@Override
	public ITerrestrialVehicle createTerrestrialVehicle() {
		return new MannedTerrestrialVehicle();
	}
	
}
