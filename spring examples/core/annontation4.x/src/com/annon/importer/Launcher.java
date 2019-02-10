package com.annon.importer;

public class Launcher {
	private Rocket rocket;

	public void launch() {
		rocket.fire();
	}

	public void setRocket(Rocket rocket) {
		this.rocket = rocket;
	}

}
