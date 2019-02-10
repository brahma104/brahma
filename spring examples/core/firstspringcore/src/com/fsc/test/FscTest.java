package com.fsc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fsc.beans.IMessageConverter;
import com.fsc.beans.MessageWriter;

public class FscTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/fsc/common/application-context.xml"));
		MessageWriter messageWriter = factory.getBean("messageWriter", MessageWriter.class);
		messageWriter.writeMessage("Welcome to Spring!");
	}
}












