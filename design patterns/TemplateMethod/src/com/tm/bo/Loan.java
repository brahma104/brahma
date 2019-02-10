package com.tm.bo;

public class Loan {
	protected String loanType;
	protected String category;
	protected long loanAmount;
	protected int tenure;

	public Loan(String loanType, String category, long loanAmount, int tenure) {
		this.loanType = loanType;
		this.category = category;
		this.loanAmount = loanAmount;
		this.tenure = tenure;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

}
