package com.ara.aspect;

import org.aspectj.lang.JoinPoint;

public class KeyCheckAspect {
	public void check(JoinPoint jp, Object ret) throws Exception {
		if ((Integer) ret <= 0) {
			throw new Exception("weak key generated");
		}
	}
}
