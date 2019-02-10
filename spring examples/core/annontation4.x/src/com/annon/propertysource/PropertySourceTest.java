package com.annon.propertysource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertySourceTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.annon.propertysource");
		Holiday holiday = context.getBean("holiday", Holiday.class);
		System.out.println(holiday);
	}
}
