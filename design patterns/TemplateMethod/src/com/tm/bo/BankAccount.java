package com.tm.bo;

public class BankAccount {
	protected String accountNo;
	protected String accountHolderName;
	protected String ifscCode;
	protected String accountType;
	protected String branch;

	public BankAccount(String accountNo, String accountHolderName, String ifscCode, String accountType, String branch) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.ifscCode = ifscCode;
		this.accountType = accountType;
		this.branch = branch;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
