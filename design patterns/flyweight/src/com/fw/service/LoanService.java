package com.fw.service;

public interface LoanService {
	String applyLoan(long principle, int tenure, String personName, String mobile, String emailAddress,
			String occupation, double annualIncome);
}
