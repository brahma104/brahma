package com.ser.bean;

import java.io.Serializable;

public class Account implements Serializable {
	private static final long serialVersionUID = 1588363878428317490L;
	private int accountNo;
	private String accountType;
	private String branchName;

	public Object writeReplace() {
		QuickAccount qAccount = null;

		System.out.println("writeReplace()");
		qAccount = new QuickAccount();
		qAccount.setAccountNo(accountNo);
		if (accountType.equals("current")) {
			qAccount.setAccountType(1);
		}
		if (branchName.equals("Madhapur")) {
			qAccount.setBranch(101);
		}
		return qAccount;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

}
