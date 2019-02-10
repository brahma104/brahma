package com.tm.factory;

import com.tm.pattern.AbstractLoanService;
import com.tm.pattern.DwacraLoanService;
import com.tm.pattern.WomenWelfareLoanService;

public class LoanServiceFactory {
	public static AbstractLoanService getLoanService(String loanType) {
		AbstractLoanService loanService = null;

		if (loanType.equals("dwacra")) {
			loanService = new DwacraLoanService();
		} else if (loanType.equals("womenwelfare")) {
			loanService = new WomenWelfareLoanService();
		}
		return loanService;
	}
}
