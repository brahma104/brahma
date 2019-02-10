package com.fw.service;

import java.util.UUID;

public class HomeLoanService implements LoanService {

	@Override
	public String applyLoan(long principle, int tenure, String personName, String mobile, String emailAddress,
			String occupation, double annualIncome) {
		return "HL-" + UUID.randomUUID().toString() + "-" + this.hashCode();
	}

}
