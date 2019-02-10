package com.ta.apsect;

import org.aspectj.lang.JoinPoint;

public class ExceptionLoggingAspect {
	public void logException(JoinPoint jp, IllegalArgumentException iae) {
		System.out.println("Message :" + iae.getMessage());
	}
}
