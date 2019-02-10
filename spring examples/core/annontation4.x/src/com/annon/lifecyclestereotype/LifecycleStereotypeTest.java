package com.annon.lifecyclestereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifecycleStereotypeTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.annon.lifecyclestereotype");
		((AnnotationConfigApplicationContext) context).registerShutdownHook();

		Math math = context.getBean("math", Math.class);
		System.out.println(math);
	}
}















