package com.icicidirect.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.icicidirect.handler.StockHandler;

public class IFMITest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/icicidirect/common/application-context.xml"));
		StockHandler handler = factory.getBean("stockHandler", StockHandler.class);
		handler.showStockPrice("cipla");
	}
}










