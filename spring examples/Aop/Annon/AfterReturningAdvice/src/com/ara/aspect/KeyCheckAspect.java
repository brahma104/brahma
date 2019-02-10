package com.ara.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class KeyCheckAspect extends BasePointcut {
	@AfterReturning(value = "commonPointcut()", returning = "ret")
	public void check(JoinPoint jp, Object ret) throws Exception {
		if ((Integer) ret <= 0) {
			throw new Exception("weak key generated");
		}
	}
}
