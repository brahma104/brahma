package com.ser.bean;

import java.io.Serializable;

public class QuickAccount implements Serializable {
	private int accountNo;
	private int accountType;
	private int branch;

	public Object readResolve() {
		Account account = null;
		System.out.println("readResolve()");
		account = new Account();

		account.setAccountNo(accountNo);
		account.setAccountType(accountType == 0 ? "savings" : "current");
		account.setBranchName(branch == 101 ? "Madhapur" : null);

		return account;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getAccountType() {
		return accountType;
	}

	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}

	public int getBranch() {
		return branch;
	}

	public void setBranch(int branch) {
		this.branch = branch;
	}

}
