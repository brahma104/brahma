package com.pac.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pac.beans.Address;

public class PACTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/pac/common/application-context.xml"));
		Address address = factory.getBean("address", Address.class);
		System.out.println(address);
	}
}
