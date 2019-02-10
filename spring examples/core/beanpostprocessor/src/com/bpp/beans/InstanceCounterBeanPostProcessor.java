package com.bpp.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.bpp.test.BPPTest;

public class InstanceCounterBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object object, String beanName) throws BeansException {
		BPPTest.instances++;
		return object;
	}

	@Override
	public Object postProcessBeforeInitialization(Object object, String beanName) throws BeansException {
		return object;
	}

}
