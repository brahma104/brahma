package com.ara.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class BasePointcut {

	@Pointcut("execution(* com.ara.beans.*.*(..))")
	public void commonPointcut() {
	}
}
