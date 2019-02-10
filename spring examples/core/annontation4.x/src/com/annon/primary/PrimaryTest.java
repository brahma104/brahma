package com.annon.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.annon.primary");
		Robot robot = context.getBean("robot", Robot.class);
		robot.start();
	}
}
