package com.pc.test;
import com.pc.pu.*;

public class Test {
	public static void main(String[] args) throws Exception {
		Launcher launcher = new Launcher();
		launcher.launch();
		ClassLoader sysCl = Test.class.getClassLoader();
		Class lClass = Class.forName("com.pc.pu.Launcher", true, sysCl);
		System.out.println("2nd : "+ lClass.getClassLoader().getClass().getName());
	}
}