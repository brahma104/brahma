package com.pc.pu;
public class Launcher {
	public void launch() {
		System.out.println(Launcher.class.getClassLoader().getClass().getName());
		System.out.println("launching...");
	}
}