package edu.dpb.ch24.i03.examples.ex03.homedefence.sol01.observers;

import java.text.SimpleDateFormat;

import edu.dpb.ch24.i03.examples.ex03.homedefence.sol01.Incident;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol01.Observer;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol01.sensors.FireSensor;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol01.sensors.Sensor;

public class FireStation implements Observer {
	private SimpleDateFormat dateFormat = new SimpleDateFormat(
			"HH:mm EEE, dd MMM");

	@Override
	public void update(Incident incident) {
		Sensor sensor = incident.getSensor();

		System.out.println("[FireStation] " + sensor.getType()
				+ " Incident at "
				+ dateFormat.format(incident.getTimeOccurrence()) + ".");

		FireSensor fireSensor = (FireSensor) sensor;
		System.out.println("[FireStation] Indexes: temperature= "
				+ fireSensor.getTemperatureDegree() + ", smokeRate= "
				+ fireSensor.getSmokeRate() + ".");

		System.out.println("[FireStation] Send fire truck.");
		System.out.println("==========\n");
	}
}
