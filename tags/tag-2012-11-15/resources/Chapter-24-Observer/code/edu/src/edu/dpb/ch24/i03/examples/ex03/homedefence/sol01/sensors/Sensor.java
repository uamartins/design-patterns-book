package edu.dpb.ch24.i03.examples.ex03.homedefence.sol01.sensors;

import java.util.HashSet;

import edu.dpb.ch24.i03.examples.ex03.homedefence.sol01.Incident;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol01.Observer;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol01.Subject;

public abstract class Sensor extends Subject {
	private int id;
	private SensorType type;
	private static int counterId;

	public Sensor(SensorType type) {
		super.observers = new HashSet<Observer>();
		id = (++counterId);
		this.type = type;
	}

	public void notifyObservers() {
		Incident incident = new Incident(this);

		for (Observer observer : observers) {
			observer.update(incident);
		}
	}

	@Override
	public String toString() {
		return type + "Sensor_" + String.format("%02d", id);
	}

	public int getId() {
		return id;
	}

	public SensorType getType() {
		return type;
	}
}
