package com.don.beans;

public class LoanParameter {
	protected String loanType;
	protected long minPrincipleAmount;
	protected long maxPrincipleAmount;
	protected int minTenure;
	protected int maxTenure;
	protected String place;
	protected float interestRate;

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public long getMinPrincipleAmount() {
		return minPrincipleAmount;
	}

	public void setMinPrincipleAmount(long minPrincipleAmount) {
		this.minPrincipleAmount = minPrincipleAmount;
	}

	public long getMaxPrincipleAmount() {
		return maxPrincipleAmount;
	}

	public void setMaxPrincipleAmount(long maxPrincipleAmount) {
		this.maxPrincipleAmount = maxPrincipleAmount;
	}

	public int getMinTenure() {
		return minTenure;
	}

	public void setMinTenure(int minTenure) {
		this.minTenure = minTenure;
	}

	public int getMaxTenure() {
		return maxTenure;
	}

	public void setMaxTenure(int maxTenure) {
		this.maxTenure = maxTenure;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

}
