package com.tm.test;

import java.util.Date;

import com.tm.bo.Address;
import com.tm.bo.BankAccount;
import com.tm.bo.BusinessPurpose;
import com.tm.bo.DemographicInfo;
import com.tm.bo.EducationDetails;
import com.tm.bo.Loan;
import com.tm.bo.LoanApplication;
import com.tm.factory.LoanServiceFactory;
import com.tm.pattern.AbstractLoanService;

public class Application {
	public static void main(String[] args) {
		DemographicInfo demographicInfo = null;
		Address address = null;
		BankAccount bankAccount = null;
		EducationDetails educationDetails = null;
		Loan loan = null;
		BusinessPurpose purpose = null;
		LoanApplication loanApplication = null;
		AbstractLoanService loanService = null;

		demographicInfo = new DemographicInfo("Subba rao", "a3803", "Male", new Date(1820, 2, 12), "03830",
				"subbu@gmail.com");
		address = new Address("ganapathi temple street", "vasepur", "jh", 394, "India");
		bankAccount = new BankAccount("987977537392837", "subbu rao", "ifc033", "savings", "vasepur");
		educationDetails = new EducationDetails("10", "Full Time", 2000, "OU");
		loan = new Loan("dwacra", "weaving", 98393, 36);
		purpose = new BusinessPurpose("Subbrao weavers", "domestic", "vasepur", 99898L, new Date(), "93830358");
		loanApplication = new LoanApplication(demographicInfo, address, bankAccount, educationDetails, loan, purpose);

		loanService = LoanServiceFactory.getLoanService("dwacra");
		String applicationNo = loanService.applyLoan(loanApplication);
		System.out.println("application no : " +applicationNo);
	}
}



















