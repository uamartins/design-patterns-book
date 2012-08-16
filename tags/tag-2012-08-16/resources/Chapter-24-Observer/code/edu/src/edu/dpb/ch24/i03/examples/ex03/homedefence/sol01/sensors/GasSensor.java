package edu.dpb.ch24.i03.examples.ex03.homedefence.sol01.sensors;

public class GasSensor extends Sensor {
	// gas density measurement in the range from 0 to 100 %
	private int gasRate;
	private static final int CRITICAL_GAS = 50;

	public GasSensor() {
		super(SensorType.GAS);
	}

	public void setGasRate(int gasRate) {
		this.gasRate = gasRate;
		if (gasRate > CRITICAL_GAS) {
			notifyObservers();
		}
	}

	public int getGasRate() {
		return gasRate;
	}
}
