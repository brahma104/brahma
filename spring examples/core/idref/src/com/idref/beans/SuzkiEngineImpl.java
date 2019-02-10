package com.idref.beans;

public class SuzkiEngineImpl implements IEngine {

	@Override
	public void accelerate(int speed) {
		System.out.println("accelerating suzki engine to speed :" + speed);
	}

}
