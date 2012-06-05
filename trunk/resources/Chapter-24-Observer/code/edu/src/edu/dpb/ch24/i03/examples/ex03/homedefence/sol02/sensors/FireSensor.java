package edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.sensors;

import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.ChangeManager;

public class FireSensor extends Sensor {
	// the temperature based on the Celsius scale (°C)
	private int temperatureDegree;
	// smoke density measurement in the range from 0 to 100 %
	private int smokeRate;
	private static final int CRITICAL_TEMPERATURE = 50;
	private static final int CRITICAL_SMOKE = 50;

	public FireSensor(ChangeManager changeManager) {
		super(SensorType.FIRE, changeManager);
	}

	public void setFireIndexes(int temperatureDegree, int smokeRate) {
		this.temperatureDegree = temperatureDegree;
		this.smokeRate = smokeRate;
		if (temperatureDegree > CRITICAL_TEMPERATURE
				&& smokeRate > CRITICAL_SMOKE) {
			notifySubjectObservers();
		}
	}

	// getters
	public int getTemperatureDegree() {
		return temperatureDegree;
	}

	public int getSmokeRate() {
		return smokeRate;
	}
}
