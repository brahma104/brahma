package com.aa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Order(2)
@Aspect
public class LoggingAspect {
	@Around("execution(* com.aa.beans.*.*(..)) and args(x,y)")
	public Object log(ProceedingJoinPoint pjp, int x, int y) throws Throwable {
		String methodName = null;
		Object[] args = null;

		methodName = pjp.getSignature().getName();
		args = pjp.getArgs();
		System.out.println("entered into " + methodName + "(" + x + "," + y + ")");
		Object ret = pjp.proceed();
		System.out.println("exiting from " + methodName + " with ret : " + ret);
		return ret;
	}
}
