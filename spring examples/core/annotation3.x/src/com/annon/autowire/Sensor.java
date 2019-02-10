package com.annon.autowire;

public class Sensor {
	private int sensorNo;
	private String sensorType;

	public void setSensorNo(int sensorNo) {
		this.sensorNo = sensorNo;
	}

	public void setSensorType(String sensorType) {
		this.sensorType = sensorType;
	}

	@Override
	public String toString() {
		return "Sensor [sensorNo=" + sensorNo + ", sensorType=" + sensorType + "]";
	}

}
