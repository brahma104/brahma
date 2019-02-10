package com.singleton.li.pattern;

import java.io.Serializable;

public abstract class DoubleSafeNoCopyAndTransformAccount implements Cloneable, Serializable {
	private static final long serialVersionUID = -4175714161625191179L;
	private static DoubleSafeNoCopyAndTransformAccount account;
	private int accountNo;

	private DoubleSafeNoCopyAndTransformAccount() {
	}

	public static DoubleSafeNoCopyAndTransformAccount getAccount() {
		if (account == null) {
			synchronized (DoubleSafeNoCopyAndTransformAccount.class) {
				if (account == null) {
					account = new DoubleSafeNoCopyAndTransformAccount(){};
				}
			}
		}
		return account;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public Object readResolve() {
		DoubleSafeNoCopyAndTransformAccount account = null;

		account = getAccount();
		account.setAccountNo(accountNo);

		return account;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Cloning is not allowed");
	}

}
