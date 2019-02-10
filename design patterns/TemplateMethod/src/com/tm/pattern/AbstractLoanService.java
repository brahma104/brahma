package com.tm.pattern;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.tm.bo.Address;
import com.tm.bo.BankAccount;
import com.tm.bo.BusinessPurpose;
import com.tm.bo.DemographicInfo;
import com.tm.bo.EducationDetails;
import com.tm.bo.Loan;
import com.tm.bo.LoanApplication;
import com.tm.exception.LoanEligibilityFailedException;

public abstract class AbstractLoanService {
	protected List<String> discrepencies;

	public AbstractLoanService() {
		discrepencies = new ArrayList<>();
	}

	/**
	 * Template Method
	 * @param loanApplication
	 * @return
	 */
	public String applyLoan(LoanApplication loanApplication) {
		String applicationNo = null;

		if (verifyDemographic(loanApplication.getDemographicInfo()) == false) {
			throw new LoanEligibilityFailedException("Your age doesn't meets the criteria");
		}
		if (verifyAddress(loanApplication.getAddress())) {
			discrepencies.add("In-Sufficient address information");
		}
		if (verifyEducation(loanApplication.getEducationDetails()) == false) {
			discrepencies.add("Education Information is mis-matched");
		}
		if (checkBankAccount(loanApplication.getBankAccount()) == false) {
			discrepencies.add("provide valid bank account information");
		}
		if (checkLoanEligibility(loanApplication.getLoan(), loanApplication.getPurpose()) == false) {
			throw new LoanEligibilityFailedException("Your application is not eligible");
		}
		double amount = computeElibilityAmount(loanApplication.getLoan(), loanApplication.getPurpose());
		loanApplication.setEligibleAmount(amount);
		applicationNo = saveLoanApplication(loanApplication);

		return applicationNo;
	}

	protected boolean verifyDemographic(DemographicInfo demographicInfo) {
		int year = 0;
		int cYear = 0;
		Calendar calendar = null;

		calendar = Calendar.getInstance();
		cYear = calendar.get(Calendar.YEAR);
		year = demographicInfo.getDob().getYear();
		if ((cYear - year) > 60) {
			return false;
		}
		return true;
	}

	protected boolean checkBankAccount(BankAccount bankAccount) {
		if (bankAccount.getAccountNo().length() != 16) {
			return false;
		}
		return true;
	}

	protected String saveLoanApplication(LoanApplication loanApplication) {
		String applicationNo = null;

		applicationNo = UUID.randomUUID().toString();
		loanApplication.setAppliedDate(new Date());
		if (discrepencies.size() > 0) {
			loanApplication.setStatus("pending");
			loanApplication.setComments(discrepencies.toString());
		} else {
			loanApplication.setStatus("accepted");
			loanApplication.setComments("reach to your local government bodies for further process");
		}
		System.out.println("saving loan application...");

		return applicationNo;
	}

	abstract protected double computeElibilityAmount(Loan loan, BusinessPurpose purpose);

	abstract protected boolean checkLoanEligibility(Loan loan, BusinessPurpose purpose);

	abstract protected boolean verifyEducation(EducationDetails educationDetails);

	abstract protected boolean verifyAddress(Address address);

}
