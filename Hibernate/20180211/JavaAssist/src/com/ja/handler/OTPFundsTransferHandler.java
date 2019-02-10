package com.ja.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OTPFundsTransferHandler implements InvocationHandler {
	private Object object;

	public OTPFundsTransferHandler(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("otp authentication");

		return method.invoke(object, args);
	}

}
