package com.tm.bo;

import java.util.Date;

public class LoanApplication {
	protected DemographicInfo demographicInfo;
	protected Address address;
	protected BankAccount bankAccount;
	protected EducationDetails educationDetails;
	protected Loan loan;
	protected BusinessPurpose purpose;
	protected Date appliedDate;
	protected double eligibleAmount;
	protected String status;
	protected String comments;

	public LoanApplication(DemographicInfo demographicInfo, Address address, BankAccount bankAccount,
			EducationDetails educationDetails, Loan loan, BusinessPurpose purpose) {
		this.demographicInfo = demographicInfo;
		this.address = address;
		this.bankAccount = bankAccount;
		this.educationDetails = educationDetails;
		this.loan = loan;
		this.purpose = purpose;
	}

	public DemographicInfo getDemographicInfo() {
		return demographicInfo;
	}

	public void setDemographicInfo(DemographicInfo demographicInfo) {
		this.demographicInfo = demographicInfo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public EducationDetails getEducationDetails() {
		return educationDetails;
	}

	public void setEducationDetails(EducationDetails educationDetails) {
		this.educationDetails = educationDetails;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public BusinessPurpose getPurpose() {
		return purpose;
	}

	public void setPurpose(BusinessPurpose purpose) {
		this.purpose = purpose;
	}

	public double getEligibleAmount() {
		return eligibleAmount;
	}

	public void setEligibleAmount(double eligibleAmount) {
		this.eligibleAmount = eligibleAmount;
	}

	public Date getAppliedDate() {
		return appliedDate;
	}

	public void setAppliedDate(Date appliedDate) {
		this.appliedDate = appliedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
