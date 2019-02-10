package com.don.beans;

public class LoanInfo {
	protected String loanType;
	protected long principle;
	protected int tenure;
	protected float interestRate;
	protected float interestAmount;
	protected double repaymentAmount;
	protected double emi;

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public long getPrinciple() {
		return principle;
	}

	public void setPrinciple(long principle) {
		this.principle = principle;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public float getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(float interestAmount) {
		this.interestAmount = interestAmount;
	}

	public double getRepaymentAmount() {
		return repaymentAmount;
	}

	public void setRepaymentAmount(double repaymentAmount) {
		this.repaymentAmount = repaymentAmount;
	}

	public double getEmi() {
		return emi;
	}

	public void setEmi(double emi) {
		this.emi = emi;
	}

	@Override
	public String toString() {
		return "LoanInfo [loanType=" + loanType + ", principle=" + principle + ", tenure=" + tenure + ", interestRate="
				+ interestRate + ", interestAmount=" + interestAmount + ", repaymentAmount=" + repaymentAmount
				+ ", emi=" + emi + "]";
	}

}
