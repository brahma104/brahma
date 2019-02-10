package com.wwn.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.wwn.beans.Plot;

public class WWNTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/wwn/common/application-context.xml"));
		Plot plot = factory.getBean("plot", Plot.class);
		System.out.println(plot);
	}
}
