package com.ara.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ara.beans.KeyCheckAdvice;
import com.ara.beans.KeyGenerator;

public class ARATest {
	public static void main(String[] args) {
		KeyGenerator keyGenerator = new KeyGenerator();
		KeyCheckAdvice keyCheckAdvice = new KeyCheckAdvice();
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(keyGenerator);
		pf.addAdvice(keyCheckAdvice);
		KeyGenerator proxy = (KeyGenerator) pf.getProxy();
		System.out.println("key : " + proxy.generateKey(10));
		System.out.println("key : " + proxy.generateKey(7));
	}

}
