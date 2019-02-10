package com.cc.beans;

public class Account {
	private int accountNo;
	private String uniqueIdentificationNo;

	public Account(int accountNo) {
		this.accountNo = accountNo;
	}

	public Account(String uniqueIdentificationNo) {
		this.uniqueIdentificationNo = uniqueIdentificationNo;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", uniqueIdentificationNo=" + uniqueIdentificationNo + "]";
	}

}
