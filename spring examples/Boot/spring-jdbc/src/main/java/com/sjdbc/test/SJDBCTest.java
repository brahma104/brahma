package com.sjdbc.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sjdbc.service.ProductService;

@SpringBootApplication(scanBasePackages = { "com.sjdbc.dao", "com.sjdbc.service" })
public class SJDBCTest {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SJDBCTest.class);
		ProductService productService = context.getBean("productService", ProductService.class);
		String productName = productService.getProductName(1);
		System.out.println("productName : " + productName);
	}
}
