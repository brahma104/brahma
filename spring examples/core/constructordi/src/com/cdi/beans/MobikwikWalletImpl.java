package com.cdi.beans;

public class MobikwikWalletImpl implements Wallet {

	@Override
	public boolean pay(String fromMobile, String toMobile, String description, double amount) {
		System.out.println("MobikwikWallet transaction has been processed...");
		return true;
	}

}
