package edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.simulator;

import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.manager.DAGChangeManager;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.observers.Emergency;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.observers.FireStation;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.observers.Owner;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.observers.Police;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.sensors.FireSensor;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.sensors.GasSensor;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.sensors.MotionSensor;

public class MainClass {
	public static void main(String[] args) {
		// 0. create ChangeManager
//		 SimpleChangeManager changeManager = SimpleChangeManager.getInstance();
		DAGChangeManager changeManager = DAGChangeManager.getInstance();

		// 1. create sensors
		MotionSensor motionSensor = new MotionSensor(changeManager);
		FireSensor fireSensor = new FireSensor(changeManager);
		GasSensor gasSensor = new GasSensor(changeManager);

		// 2. create subscribers
		Owner owner = new Owner();
		Police police = new Police();
		FireStation firestStation = new FireStation();
		Emergency emergency = new Emergency();

		// 3.1 Owner's subscription
		motionSensor.attach(owner);
		fireSensor.attach(owner);
		gasSensor.attach(owner);

		// 3.2 Police's subscription
		motionSensor.attach(police);

		// 3.3 FireStation's subscription
		fireSensor.attach(firestStation);

		// 3.4 Emergency's subscription
		fireSensor.attach(emergency);
		gasSensor.attach(emergency);

		// 4.1 simulate motion incident
		// motionSensor.setMotionDected(true);

		// 4.2 simulate fire incident
		fireSensor.setFireIndexes(60, 60);

		// 4.3 simulate gas incident
		// gasSensor.setGasRate(60);
	}
}
