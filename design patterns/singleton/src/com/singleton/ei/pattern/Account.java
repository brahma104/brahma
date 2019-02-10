package com.singleton.ei.pattern;

public class Account {
	private static Account instance = new Account();

	private Account() {
	}

	public static Account getAccount() {
		return instance;
	}
}
