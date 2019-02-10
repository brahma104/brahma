package com.sdjpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sdjpa.entities.Product;
import com.sdjpa.service.ProductService;

@SpringBootApplication(scanBasePackages = { "com.sdjpa.entities", "com.sdjpa.service" })
@EnableJpaRepositories(basePackages = { "com.sdjpa.repositories" })
public class SDJPATest {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SDJPATest.class);
		ProductService productService = context.getBean("productService", ProductService.class);
		Product product = productService.findProduct(1);
		System.out.println(product);
	}

}
