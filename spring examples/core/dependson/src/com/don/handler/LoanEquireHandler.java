package com.don.handler;

import java.util.List;

import com.don.beans.LoanEnquiry;
import com.don.beans.LoanInfo;
import com.don.beans.LoanParameter;
import com.don.helper.Cache;

public class LoanEquireHandler {
	private Cache cache;

	public LoanInfo enquire(LoanEnquiry loanEnquiry) throws Exception {
		float interestRate = 0.0f;
		float interestAmount = 0.0f;
		float emi = 0.0f;
		double repaymentAmount = 0.0;
		LoanInfo loanInfo = null;
		List<LoanParameter> loanParameters = null;
		LoanParameter loanParameter = null;

		if (cache.containsKey(loanEnquiry.getLoanType()) == false) {
			throw new Exception("No data found in cache");
		}
		loanParameters = (List<LoanParameter>) cache.get(loanEnquiry.getLoanType());
		for (LoanParameter lp : loanParameters) {
			if ((loanEnquiry.getPrinciple() >= lp.getMinPrincipleAmount()
					&& loanEnquiry.getPrinciple() <= lp.getMaxPrincipleAmount())
					&& (loanEnquiry.getTenure() >= lp.getMinTenure() && loanEnquiry.getTenure() <= lp.getMaxTenure())
					&& loanEnquiry.getPlace().equals(lp.getPlace())) {
				loanParameter = lp;
				break;
			}
		}
		if (loanParameter == null) {
			throw new Exception("No matching loan found for your loan enquiry");
		}
		interestRate = loanParameter.getInterestRate();
		interestAmount = (loanEnquiry.getPrinciple() * loanEnquiry.getTenure() * interestRate) / 100;
		repaymentAmount = loanEnquiry.getPrinciple() + interestAmount;
		emi = (float) (repaymentAmount / loanEnquiry.getTenure());
		loanInfo = new LoanInfo();
		loanInfo.setLoanType(loanEnquiry.getLoanType());
		loanInfo.setPrinciple(loanEnquiry.getPrinciple());
		loanInfo.setTenure(loanEnquiry.getTenure());
		loanInfo.setInterestAmount(interestAmount);
		loanInfo.setInterestRate(interestRate);
		loanInfo.setRepaymentAmount(repaymentAmount);
		loanInfo.setEmi(emi);
		return loanInfo;
	}

	public void setCache(Cache cache) {
		this.cache = cache;
	}

}
