package edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.sensors;

public enum SensorType {
	MOTION("Motion"), FIRE("Fire"), GAS("Gas");

	private final String typeName;

	private SensorType(String typeName) {
		this.typeName = typeName;
	}

	@Override
	public String toString() {
		return typeName;
	}
}
