package com.fw.service;

import java.util.UUID;

public class AutomobileLoanService implements LoanService {

	@Override
	public String applyLoan(long principle, int tenure, String personName, String mobile, String emailAddress,
			String occupation, double annualIncome) {
		return "AML-" + UUID.randomUUID().toString() + "-" + this.hashCode();
	}

}
