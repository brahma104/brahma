package com.blc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.blc.beans.Math;

public class BLCTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/blc/common/application-context.xml"));
		Math math = factory.getBean("math", Math.class);
		System.out.println(math);
		((ConfigurableListableBeanFactory) factory).destroySingletons();
	}

}









