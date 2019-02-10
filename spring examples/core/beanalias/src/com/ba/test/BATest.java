package com.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.Toy;

public class BATest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/ba/common/application-context.xml"));
		/*Toy toy = factory.getBean("robert,car", Toy.class);
		System.out.println(toy);*/
		String[] names = factory.getAliases("toy");
		for(String name : names) {
			System.out.println(name);
		}
	}
}












