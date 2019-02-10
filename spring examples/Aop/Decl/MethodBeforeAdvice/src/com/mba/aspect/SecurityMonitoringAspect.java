package com.mba.aspect;

import org.aspectj.lang.JoinPoint;

import com.mba.helper.SecurityManager;

public class SecurityMonitoringAspect {
	private SecurityManager securityManager;

	public SecurityMonitoringAspect(SecurityManager securityManager) {
		this.securityManager = securityManager;
	}

	public void audit(JoinPoint jp) {
		System.out
				.println("called method : " + jp.getSignature().getName() + " by " + securityManager.getLoggedInUser());
	}

	public void securityCheck(JoinPoint jp) throws IllegalAccessException {
		if (securityManager.isAuthenticated() == false) {
			throw new IllegalAccessException("invalid un/pwd");
		}
	}
}
