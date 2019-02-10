package com.annon.lookupstereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LookupStreotypeTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.annon.lookupstereotype");
		Container container = context.getBean("container", Container.class);
		container.receive("data1");
		container.receive("data2");
	}
}
