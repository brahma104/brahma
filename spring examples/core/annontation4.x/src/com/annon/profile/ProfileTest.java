package com.annon.profile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileTest {
	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "test");
		ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
		ProductDao productDao = context.getBean("productDao", ProductDao.class);
		productDao.saveProduct();
		/*ConnectionFactory cf = context.getBean("connectionFactory", ConnectionFactory.class);
		System.out.println(cf.getConnection());*/
	}
}
