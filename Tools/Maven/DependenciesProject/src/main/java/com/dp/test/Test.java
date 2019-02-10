package com.dp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.dp.beans.Rocket;

public class Test {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/dp/common/application-context.xml"));
		Rocket rocket = factory.getBean("rocket", Rocket.class);
		rocket.launch();
	}
}
