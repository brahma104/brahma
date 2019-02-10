package com.bi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bi.beans.Bus;
import com.bi.beans.Car;

public class BITest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/bi/common/application-context.xml"));
		Car car2 = factory.getBean("car2", Car.class);
		System.out.println(car2);
		/*Bus bus = factory.getBean("bus", Bus.class);
		System.out.println(bus);*/
	}
}
