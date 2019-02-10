package com.fw.test;

import com.fw.factory.ObjectFactory;
import com.fw.service.LoanService;

public class FWTest {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		LoanService loanService = null;
		ObjectFactory objectFactory = null;

		objectFactory = new ObjectFactory();
		for (int i = 0; i < 10; i++) {
			loanService = (LoanService) objectFactory.getObject("com.fw.service.HomeLoanService");
			System.out.println(loanService.applyLoan(100000, 12 * i, "Mathew", "039304", "mathew" + i + "@gmail.com", "s.e", i + 1000));
		}

	}
}
