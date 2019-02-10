package com.mba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mba.beans.LoanManager;
import com.mba.config.AppConfig;
import com.mba.helper.SecurityManager;

public class MBATest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		SecurityManager securityManager = context.getBean("securityManager", SecurityManager.class);
		securityManager.login("john", "welcome1");
		LoanManager loanManager = context.getBean("loanManager", LoanManager.class);
		boolean approved = loanManager.approveLoan(393);
		System.out.println("approved ? :" + approved);
		securityManager.logout();
	}
}
