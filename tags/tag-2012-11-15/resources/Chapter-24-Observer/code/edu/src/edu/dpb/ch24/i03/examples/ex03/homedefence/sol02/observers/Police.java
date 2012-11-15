package edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.observers;

import java.text.SimpleDateFormat;

import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.sensors.Sensor;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.Incident;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.Observer;

public class Police implements Observer{
	private SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm EEE, dd MMM"); 
	
	@Override
	public void update(Incident incident) {
		Sensor sensor = incident.getSensor();

		System.out.println("[Police] " + sensor.getType() + " Incident at "
				+ dateFormat.format(incident.getTimeOccurrence())+".");

		System.out.println("[Police] Send police car.");
		System.out.println("==========\n");
	}
}
