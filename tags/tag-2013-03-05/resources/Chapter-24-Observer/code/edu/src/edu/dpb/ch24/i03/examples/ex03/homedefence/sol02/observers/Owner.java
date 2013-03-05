package edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.observers;

import java.text.SimpleDateFormat;

import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.Incident;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.Observer;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.sensors.FireSensor;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.sensors.GasSensor;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.sensors.Sensor;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.sensors.SensorType;

public class Owner implements Observer {
	private SimpleDateFormat dateFormat = new SimpleDateFormat(
			"HH:mm EEE, dd MMM");

	@Override
	public void update(Incident incident) {
		Sensor sensor = incident.getSensor();

		System.out.println("[Owner] " + sensor.getType() + " Incident at "
				+ dateFormat.format(incident.getTimeOccurrence())
				+ ". Detected by " + sensor + ".");

		if (sensor.getType() == SensorType.FIRE) {
			FireSensor fireSensor = (FireSensor) sensor;
			System.out.println("[Owner] Indexes: temperature= "
					+ fireSensor.getTemperatureDegree() + ", smokeRate= "
					+ fireSensor.getSmokeRate() + ".");
		}

		if (sensor.getType() == SensorType.GAS) {
			GasSensor gasSensor = (GasSensor) sensor;
			System.out.println("[Owner] Indexes: gasRate= "
					+ gasSensor.getGasRate() + ".");
		}

		System.out.println("[Owner] Call the family and neighbours.");
		System.out.println("==========\n");
	}
}
