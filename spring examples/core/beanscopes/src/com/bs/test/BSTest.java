package com.bs.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bs.beans.Bike;

public class BSTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/bs/common/application-context.xml"));
		Bike bike1 = factory.getBean("bike", Bike.class);
		Bike bike2 = factory.getBean("bike", Bike.class);
		System.out.println("bike1==bike2 ? : " + (bike1 == bike2));
	}
}















