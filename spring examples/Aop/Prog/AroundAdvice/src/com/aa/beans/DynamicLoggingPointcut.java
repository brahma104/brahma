package com.aa.beans;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

public class DynamicLoggingPointcut extends DynamicMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> classType, Object[] args) {
		if (classType.isAssignableFrom(Calculator.class) && method.getName().equals("add")) {
			int a = (Integer) args[0];
			int b = (Integer) args[1];
			if (a > 100 && b > 100) {
				return true;
			}
		}
		return false;
	}

}
