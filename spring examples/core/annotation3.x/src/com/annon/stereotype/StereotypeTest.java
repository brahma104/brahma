package com.annon.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereotypeTest {
	public static void main(String[] args) {
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext(
		 * "com/annon/stereotype/stereotype-annon-beans.xml");
		 */

		ApplicationContext context = new AnnotationConfigApplicationContext("com.annon.stereotype");
		BiCycle biCyle = context.getBean("ranger", BiCycle.class);
		biCyle.ride();

	}
}













