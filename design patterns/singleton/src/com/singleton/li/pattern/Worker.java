package com.singleton.li.pattern;

public class Worker implements Runnable {
	@Override
	public void run() {
		DoubleSafeAccount safeAccount = DoubleSafeAccount.getAccount();
		System.out.println("hc : " + safeAccount.hashCode());
	}
}
