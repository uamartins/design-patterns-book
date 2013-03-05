package edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.sensors;

import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.sensors.SensorType;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.ChangeManager;

public class MotionSensor extends Sensor {
	private boolean motionDected;

	public MotionSensor(ChangeManager changeManager) {
		super(SensorType.MOTION, changeManager);
	}

	public void setMotionDected(boolean motionDected) {
		this.motionDected = motionDected;
		if (motionDected) {
			notifySubjectObservers();
		}
	}

	public boolean isMotionDected() {
		return motionDected;
	}
}
