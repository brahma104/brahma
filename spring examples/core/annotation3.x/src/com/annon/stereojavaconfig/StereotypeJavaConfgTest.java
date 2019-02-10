package com.annon.stereojavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StereotypeJavaConfgTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.annon.stereojavaconfig");
		((AnnotationConfigApplicationContext)context).register(AppConfig.class);
		Meeting meeting = context.getBean("meeting", Meeting.class);
		System.out.println(meeting);
	}

}
