package com.ta.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ta.beans.ExceptionLoggingAdvice;
import com.ta.beans.Thrower;

public class TATest {
	public static void main(String[] args) {
		Thrower thrower = new Thrower();
		ExceptionLoggingAdvice exceptionLoggingAdvice = new ExceptionLoggingAdvice();
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(thrower);
		pf.addAdvice(exceptionLoggingAdvice);
		Thrower proxy = (Thrower) pf.getProxy();
		int i = proxy.willThrow(10);
		System.out.println(i);
		proxy.willThrow(-1);
	}
}
