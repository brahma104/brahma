package com.annon.dependson;

import org.springframework.stereotype.Component;

@Component
public class LoanCalculator {

	public LoanCalculator() {
		System.out.println("loanCalculator()");
	}

}
