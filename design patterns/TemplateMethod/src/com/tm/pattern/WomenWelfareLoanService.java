package com.tm.pattern;

import com.tm.bo.Address;
import com.tm.bo.BusinessPurpose;
import com.tm.bo.EducationDetails;
import com.tm.bo.Loan;

public class WomenWelfareLoanService extends AbstractLoanService {

	@Override
	protected double computeElibilityAmount(Loan loan, BusinessPurpose purpose) {

		return 300000;
	}

	@Override
	protected boolean checkLoanEligibility(Loan loan, BusinessPurpose purpose) {
		if (loan.getLoanAmount() <= 300000) {
			return true;
		}
		return false;
	}

	@Override
	protected boolean verifyEducation(EducationDetails educationDetails) {
		if (educationDetails.getHighestDegreeName().equals("Graduation")
				|| educationDetails.getHighestDegreeName().equals("PG")) {
			return true;
		}
		return false;
	}

	@Override
	protected boolean verifyAddress(Address address) {
		if (address.getCity().equals("hyderabad") || address.getCity().equals("warangal")) {
			return true;
		}
		return false;
	}

}
