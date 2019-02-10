package com.ta.beans;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionLoggingAdvice implements ThrowsAdvice {
	public void afterThrowing(Exception iae) {
		System.out.println("message: " + iae.getMessage());
	}
	/*public void afterThrowing(Method method, Object[] args, Object target, IllegalArgumentException iae) {
		System.out.println("Method : " + method.getName() + " with arguments : " + args[0]
				+ " has reported exception with message : " + iae.getMessage());
	}*/

	

}
