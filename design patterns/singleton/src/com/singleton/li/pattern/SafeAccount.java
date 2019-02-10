package com.singleton.li.pattern;

public class SafeAccount {
	private static SafeAccount safeAccount;

	private SafeAccount() {
	}

	public synchronized static SafeAccount getSafeAccount() {
		if (safeAccount == null) {
			safeAccount = new SafeAccount();
		}
		return safeAccount;
	}
}
