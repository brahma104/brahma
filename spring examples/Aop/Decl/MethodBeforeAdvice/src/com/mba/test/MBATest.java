package com.mba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mba.beans.LoanManager;
import com.mba.helper.SecurityManager;

public class MBATest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mba/common/application-context.xml");
		SecurityManager securityManager = context.getBean("securityManager", SecurityManager.class);
		securityManager.login("john", "welcome1");
		LoanManager loanManager = context.getBean("loanManager", LoanManager.class);
		boolean flag = loanManager.approveLoan(293);
		System.out.println("approved ? : " + flag);
		securityManager.logout();
	}
}
