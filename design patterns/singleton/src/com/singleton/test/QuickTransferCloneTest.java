package com.singleton.test;

import com.singleton.li.pattern.DoubleSafeNoCopyAccount;

public class QuickTransferCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		DoubleSafeNoCopyAccount dsncAccount = DoubleSafeNoCopyAccount.getDoubleSafeNoCopyAccount();
		/*DoubleSafeNoCopyAccount dsncAccount1 = (DoubleSafeNoCopyAccount) dsncAccount.clone();
		System.out.println("dsncAccount : " +dsncAccount.hashCode());
		System.out.println("dsncAccount1 : " +dsncAccount1.hashCode());*/
		System.out.println("dsnc hash : " + dsncAccount.hashCode());
		System.out.println("super hash : " + dsncAccount.superHashCode());
	}
}
