package com.tm.pattern;

import com.tm.bo.Address;
import com.tm.bo.BusinessPurpose;
import com.tm.bo.EducationDetails;
import com.tm.bo.Loan;

public class DwacraLoanService extends AbstractLoanService {

	@Override
	protected double computeElibilityAmount(Loan loan, BusinessPurpose purpose) {
		if (loan.getCategory().equals("weaving")) {
			return 13534.34f;
		}
		return 0;
	}

	@Override
	protected boolean checkLoanEligibility(Loan loan, BusinessPurpose purpose) {
		if (loan.getCategory().equals("weaving") && purpose.getCategory().equals("domestic")) {
			return true;
		}
		return false;
	}

	@Override
	protected boolean verifyEducation(EducationDetails educationDetails) {
		if (educationDetails.getHighestDegreeName().equals("10") || educationDetails.getHighestDegreeName().equals("12")
				|| educationDetails.getHighestDegreeName().equals("Graduation")
				|| educationDetails.getHighestDegreeName().equals("PG")) {
			return true;
		}
		return false;
	}

	@Override
	protected boolean verifyAddress(Address address) {
		if (address.getCity().equals("uppalapadu") || address.getCity().equals("vasepur")
				|| address.getCity().equals("ramghad")) {
			return true;
		}
		return false;
	}

}
