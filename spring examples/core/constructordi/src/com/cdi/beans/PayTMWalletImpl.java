package com.cdi.beans;

public class PayTMWalletImpl implements Wallet {

	@Override
	public boolean pay(String fromMobile, String toMobile, String description, double amount) {
		System.out.println("payTMWallet transaction has been processed...");
		return true;
	}

}
