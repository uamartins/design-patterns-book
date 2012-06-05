package edu.dpb.ch24.i03.examples.ex03.homedefence.sol01.sensors;

public class MotionSensor extends Sensor {
	private boolean motionDected;

	public MotionSensor() {
		super(SensorType.MOTION);
	}

	public void setMotionDected(boolean motionDected) {
		this.motionDected = motionDected;
		if (motionDected) {
			notifyObservers();
		}
	}

	public boolean isMotionDected() {
		return motionDected;
	}
}
