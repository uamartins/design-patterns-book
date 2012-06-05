package edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.sensors;

import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.Incident;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.sensors.SensorType;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.ChangeManager;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.Subject;

public abstract class Sensor extends Subject {
	protected int id;
	private SensorType type;
	private static int counterId;

	public Sensor(SensorType type, ChangeManager changeManager) {
		super(changeManager);
		id = (++counterId);
		this.type = type;
	}

	public void notifySubjectObservers() {
		Incident incident = new Incident(this);
		changeManager.notifyObservers(incident);
	}

	@Override
	public String toString() {
		return type + "Sensor_" + String.format("%02d", id);
	}

	// getters
	public int getId() {
		return id;
	}

	public SensorType getType() {
		return type;
	}
}
