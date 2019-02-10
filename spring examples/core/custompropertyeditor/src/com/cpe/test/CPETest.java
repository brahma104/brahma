package com.cpe.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cpe.beans.Address;
import com.cpe.registrar.CustomPropertyEditorRegistrar;

public class CPETest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/cpe/common/application-context.xml"));
		((ConfigurableListableBeanFactory) factory).addPropertyEditorRegistrar(new CustomPropertyEditorRegistrar());
		Address address = factory.getBean("address", Address.class);
		System.out.println(address);
	}
}
