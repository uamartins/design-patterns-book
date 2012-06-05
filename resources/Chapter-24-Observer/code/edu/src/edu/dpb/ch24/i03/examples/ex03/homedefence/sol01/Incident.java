package edu.dpb.ch24.i03.examples.ex03.homedefence.sol01;

import java.util.Date;

import edu.dpb.ch24.i03.examples.ex03.homedefence.sol01.sensors.Sensor;

public class Incident {
	private int id;
	private Sensor sensor;
	private Date timeOccurrence;
	private static int counterId;

	public Incident(Sensor sensor) {
		id = (++counterId);
		timeOccurrence = new Date();
		this.sensor = sensor;
	}

	public int getId() {
		return id;
	}

	public Sensor getSensor() {
		return sensor;
	}

	public Date getTimeOccurrence() {
		return timeOccurrence;
	}
}
