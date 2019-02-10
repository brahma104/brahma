package com.don.beans;

public class LoanEnquiry {
	protected String loanType;
	protected long principle;
	protected int tenure;
	protected String place;
	protected String occupation;
	protected double netIncome;

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

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public double getNetIncome() {
		return netIncome;
	}

	public void setNetIncome(double netIncome) {
		this.netIncome = netIncome;
	}

}
