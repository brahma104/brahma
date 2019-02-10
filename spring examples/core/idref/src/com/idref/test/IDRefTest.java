package com.idref.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.idref.beans.Car;

public class IDRefTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/idref/common/application-context.xml"));
		Car car = factory.getBean("car", Car.class);
		car.drive();
	}
}











