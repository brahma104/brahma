package com.aat.est;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.aa.beans.Calculator;
import com.aa.beans.DynamicLoggingPointcut;
import com.aa.beans.LoggingAdvice;
import com.aa.beans.StaticLoggingPointcut;

public class PointcutTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		LoggingAdvice loggingAdvice = new LoggingAdvice();
		//StaticLoggingPointcut loggingPointcut = new StaticLoggingPointcut();
		DynamicLoggingPointcut loggingPointcut = new DynamicLoggingPointcut();
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(calculator);
		pf.addAdvisor(new DefaultPointcutAdvisor(loggingPointcut, loggingAdvice));

		Calculator proxy = (Calculator) pf.getProxy();
		int sum = proxy.add(101, 201);
		System.out.println("sum : " + sum);
		int mul = proxy.multiply(10, 20);
		System.out.println("mul : " + mul);
	}
}
