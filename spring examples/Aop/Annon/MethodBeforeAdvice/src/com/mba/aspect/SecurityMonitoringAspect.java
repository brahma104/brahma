package com.mba.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mba.helper.SecurityManager;

@Component
@Aspect
public class SecurityMonitoringAspect {
	@Autowired
	private SecurityManager securityManager;

	@Pointcut("execution(* com.mba.beans.*.*(..))")
	public void securityMonitoringPointcut() {
	}

	@Before("securityMonitoringPointcut()")
	public void audit(JoinPoint jp) {
		System.out.println("called " + jp.getSignature().getName() + "(" + jp.getArgs()[0] + ") by "
				+ securityManager.getLoggedInUser());
	}

	@Before("securityMonitoringPointcut()")
	public void securityCheck(JoinPoint jp) throws IllegalAccessException {
		if (securityManager.isAuthenticated() == false) {
			throw new IllegalAccessException("invalid un/pwd");
		}
	}
}
