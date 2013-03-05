package edu.dpb.ch24.i03.examples.ex03.homedefence.sol01.simulator;

import edu.dpb.ch24.i03.examples.ex03.homedefence.sol01.observers.Emergency;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol01.observers.FireStation;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol01.observers.Owner;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol01.observers.Police;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol01.sensors.FireSensor;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol01.sensors.GasSensor;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol01.sensors.MotionSensor;

public class MainClass {
	public static void main(String[] args) {
		// 1. create sensors
		MotionSensor motionSensor = new MotionSensor();
		FireSensor fireSensor = new FireSensor();
		GasSensor gasSensor = new GasSensor();

		// 2. create subscribers
		Owner owner = new Owner();
		Police police = new Police();
		FireStation firestStation = new FireStation();
		Emergency emergency = new Emergency();

		// 3.1 Owner's subscription
		motionSensor.register(owner);
		fireSensor.register(owner);
		gasSensor.register(owner);

		// 3.2 Police's subscription
		motionSensor.register(police);

		// 3.3 FireStation's subscription
		fireSensor.register(firestStation);

		// 3.4 Emergency's subscription
		fireSensor.register(emergency);
		gasSensor.register(emergency);

		// 4.1 simulate motion incident
		// motionSensor.setMotionDected(true);

		// 4.2 simulate fire incident
		fireSensor.setFireIndexes(60, 60);

		// 4.3 simulate gas incident
		// gasSensor.setGasRate(60);
	}
}
