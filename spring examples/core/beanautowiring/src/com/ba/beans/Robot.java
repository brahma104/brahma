package com.ba.beans;

public class Robot {
	private Chip chip;
	private Sensor sensor;

	

	public Robot(Chip chip) {
		System.out.println("Robot(chip)");
		this.chip = chip;
	}
	
	public Robot(Sensor sensor) {
		System.out.println("sensor");
		this.sensor = sensor;
	}

	@Override
	public String toString() {
		return "Robot [chip=" + chip + ", sensor=" + sensor + "]";
	}

}
