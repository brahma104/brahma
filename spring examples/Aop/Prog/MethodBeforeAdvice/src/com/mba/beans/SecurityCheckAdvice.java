package com.mba.beans;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.mba.helper.SecurityManager;

public class SecurityCheckAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		SecurityManager securityManager = null;

		securityManager = SecurityManager.getInstance();
		if (securityManager.isAuthenticated() == false) {
			throw new IllegalAccessException("invalid un/pwd");
		}
	}

}
