package com.ai.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Radio implements BeanFactoryAware {
	private BeanFactory beanFactory;
	private String receiver;

	public Radio(String receiver) {
		this.receiver = receiver;
	}

	public void tune(double station) {
		IReceiver iReceiver = null;

		iReceiver = beanFactory.getBean(receiver, IReceiver.class);
		iReceiver.receive(station);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

}
