package com.cdi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cdi.beans.PaymentService;

public class CDITest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/cdi/common/application-context.xml"));
		PaymentService paymentService = factory.getBean("paymentService", PaymentService.class);
		paymentService.bill("big bazar merchant pvt ltd", 404.45f, "958586969");

	}

}
