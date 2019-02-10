package com.singleton.test;

import com.singleton.li.pattern.Account;

public class QuickTransfer {
	public static void main(String[] args) {
		Account primeAccount = Account.getAccount();
		Account quickAccount = Account.getAccount();
		System.out.println("priceAccount : " + primeAccount.hashCode());
		System.out.println("quickAccount : " + quickAccount.hashCode());
	}
}
