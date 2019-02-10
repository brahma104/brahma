package com.annon.lookupjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LookupJavaConfigTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Container container = context.getBean("container", Container.class);
		container.receive("data1");
		container.receive("data2");
	}
}
