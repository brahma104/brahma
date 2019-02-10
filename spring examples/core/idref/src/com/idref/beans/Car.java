package com.idref.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Car {
	private IEngine engine;
	private String engineId;

	public Car(String engineId) {
		this.engineId = engineId;
	}

	public void drive() {
		BeanFactory factory = null;

		System.out.println("drive()");
		factory = new XmlBeanFactory(new ClassPathResource("com/idref/common/application-context.xml"));
		engine = factory.getBean(engineId, IEngine.class);
		engine.accelerate(100);
		System.out.println("Driving Car....");
	}
}











