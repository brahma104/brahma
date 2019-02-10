package com.bpp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bpp.beans.InstanceCounterBeanPostProcessor;
import com.bpp.beans.Robot;
import com.bpp.beans.Rocket;

public class BPPTest {
	public static int instances = 0;

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/bpp/common/application-context.xml"));

		((ConfigurableListableBeanFactory) factory).addBeanPostProcessor(new InstanceCounterBeanPostProcessor());

		Rocket rocket = factory.getBean("rocket", Rocket.class);
		System.out.println("instances : "+ instances);
		Robot robot = factory.getBean("robot", Robot.class);
		System.out.println("instances : "+ instances);
	}
}














