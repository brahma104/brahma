package com.aat.est;

import org.springframework.aop.framework.ProxyFactory;

import com.aa.beans.CacheAdvice;
import com.aa.beans.Calculator;
import com.aa.beans.LoggingAdvice;

public class AroundAdviceTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		CacheAdvice cacheAdvice = new CacheAdvice();
		LoggingAdvice loggingAdvice = new LoggingAdvice();

		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(calculator);
		pf.addAdvice(cacheAdvice);
		pf.addAdvice(loggingAdvice);
		
		
		Calculator proxy = (Calculator) pf.getProxy();
		int sum = proxy.add(10, 20);
		System.out.println("sum : " + sum);
		sum = proxy.add(10, 20);
		System.out.println("sum : " + sum);

	}
}
