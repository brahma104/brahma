package com.sweb.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.sweb.controller", "com.sweb.endpoints" })
public class SWebTest {
	public static void main(String[] args) {
		SpringApplication.run(SWebTest.class, args);
	}
}
