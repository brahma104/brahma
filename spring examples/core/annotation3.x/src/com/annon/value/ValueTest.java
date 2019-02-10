package com.annon.value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValueTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/annon/value/value-annon-beans.xml");
		Machine machine = context.getBean("machine", Machine.class);
		System.out.println(machine);
	}
}
