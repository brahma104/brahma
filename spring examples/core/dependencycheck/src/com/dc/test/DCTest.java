package com.dc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.dc.beans.House;
import com.dc.beans.Owner;

public class DCTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/dc/common/application-context.xml"));
		/*Owner owner = (Owner) factory.getBean("owner");
		System.out.println(owner);*/
		House house = (House) factory.getBean("house");
		System.out.println(house);
	}
}
