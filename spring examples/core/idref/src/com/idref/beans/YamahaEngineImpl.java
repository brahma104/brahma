package com.idref.beans;

public class YamahaEngineImpl implements IEngine {
	@Override
	public void accelerate(int speed) {
		System.out.println("accelerating yamaha engine to speed : " + speed);
	}
}
