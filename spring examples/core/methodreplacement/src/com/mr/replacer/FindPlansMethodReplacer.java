package com.mr.replacer;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

public class FindPlansMethodReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object target, Method method, Object[] args) throws Throwable {
		String methodName = null;
		int age = 0;
		int coverageType = 0;
		int networkType = 0;
		int copay = 0;
		int zipCode = 0;
		String gender = null;
		methodName = method.getName();
		if (methodName != null && methodName.equals("findPlans")) {
			age = (Integer) args[0];
			coverageType = (Integer) args[1];
			networkType = (Integer) args[2];
			copay = (Integer) args[3];
			zipCode = (Integer) args[4];
			gender = (String) args[5];

			System.out.println("age : " + age + " coverageType : " + coverageType);
			return Arrays.asList(new String[] { "Jeevan Jyothi", "Jeevan Plus" });
		}
		throw new Exception("unsupported method");
	}
}




