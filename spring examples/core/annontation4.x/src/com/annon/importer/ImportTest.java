package com.annon.importer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
		Launcher launcher = context.getBean("launcher", Launcher.class);
		launcher.launch();
	}
}
