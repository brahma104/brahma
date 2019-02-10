package com.singleton.sb.pattern;

public class Account {
	private static Account account;

	/**
	 * If you have some complex instantiation logic to create the object then we
	 * should go for static-block instantiation
	 **/
	static {
		account = new Account();
	}

	private Account() {
	}

	public static Account getAccount() {
		return account;
	}
}
