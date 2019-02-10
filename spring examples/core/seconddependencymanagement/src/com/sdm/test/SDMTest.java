package com.sdm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sdm.beans.WeatherWidget;

public class SDMTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/sdm/common/application-context.xml"));
		WeatherWidget widget = factory.getBean("weatherWidget", WeatherWidget.class);
		
		widget.showTemparature("84948");
	}
}














