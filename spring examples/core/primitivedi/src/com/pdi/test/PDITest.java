package com.pdi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pdi.beans.Address;

public class PDITest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/pdi/common/application-context.xml"));
		Address address = factory.getBean("mainOfficeAddress", Address.class);
		System.out.println(address);
	}
}
