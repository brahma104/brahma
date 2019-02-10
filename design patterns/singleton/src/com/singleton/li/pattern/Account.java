package com.singleton.li.pattern;

public class Account {
	private static Account account;

	private Account() {
	}

	public static Account getAccount() {
		if (account == null) {
			account = new Account();
		}
		return account;
	}
}
