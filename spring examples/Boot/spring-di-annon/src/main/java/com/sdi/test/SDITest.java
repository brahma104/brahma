package com.sdi.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sdi.beans.BiCycle;

@SpringBootApplication(scanBasePackages = { "com.sdi.beans" })
public class SDITest {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SDITest.class);
		BiCycle biCycle = context.getBean("biCycle", BiCycle.class);
		biCycle.ride();
	}

}
