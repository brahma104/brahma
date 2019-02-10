package com.singleton.li.pattern;

public class DoubleSafeAccount {
	private static DoubleSafeAccount doubleSafeAccount;

	private DoubleSafeAccount() {
	}

	public static DoubleSafeAccount getAccount() {

		if (doubleSafeAccount == null) {
			// acquire lock at class-level
			synchronized (DoubleSafeAccount.class) {
				// System.out.println("lock acquired");
				if (doubleSafeAccount == null) {
					// System.out.println("doubleSafeAccount created..");
					doubleSafeAccount = new DoubleSafeAccount();
				}
				// System.out.println("lock released");
			}
		}
		return doubleSafeAccount;
	}

}
