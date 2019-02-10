package com.mba.test;

import org.springframework.aop.framework.ProxyFactory;

import com.mba.beans.AuditAdvice;
import com.mba.beans.LoanApprover;
import com.mba.beans.SecurityCheckAdvice;
import com.mba.helper.SecurityManager;

public class MBATest {
	public static void main(String[] args) {
		LoanApprover loanApprover = new LoanApprover();
		AuditAdvice auditAdvice = new AuditAdvice();
		SecurityCheckAdvice securityCheckAdvice = new SecurityCheckAdvice();
		
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(loanApprover);
		pf.addAdvice(auditAdvice);
		pf.addAdvice(securityCheckAdvice);
		LoanApprover proxy = (LoanApprover) pf.getProxy();
		SecurityManager securityManager = SecurityManager.getInstance();
		securityManager.login("john", "welcome1");
		System.out.println("approved ? : " + proxy.approveLoan(293L));
		securityManager.logout();
	}
}
