package com.aa.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.aa.helper.Cache;

public class CacheAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		String methodName = null;
		Object[] args = null;
		Cache cache = null;
		String key = null;

		methodName = methodInvocation.getMethod().getName();
		args = methodInvocation.getArguments();
		// below code creates key as methodName(args[0], args[1]....)
		key = methodName + "(";
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				key += args[i];
				continue;
			}
			key += "," + args[i];
		}
		key += ")";
		cache = Cache.getInstance();
		// first check whether the sum is available in cache or not for the current
		// method execution
		if (cache.containsKey(key) == true) {
			return cache.get(key);
		}
		Object ret = methodInvocation.proceed();
		cache.put(key, ret);

		return ret;
	}

}
