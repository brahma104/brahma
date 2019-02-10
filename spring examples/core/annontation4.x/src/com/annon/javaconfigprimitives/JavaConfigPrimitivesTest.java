package com.annon.javaconfigprimitives;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigPrimitivesTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Branch branch = context.getBean("panjaguttaBranch", Branch.class);
		System.out.println(branch);
	}
}
