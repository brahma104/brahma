package com.annon.javaconfig;

public class Truck {
	private Engine engine;

	public void drive() {
		engine.ignite();
		System.out.println("driving truck...");
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
