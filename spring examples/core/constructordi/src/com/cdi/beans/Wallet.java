package com.cdi.beans;

public interface Wallet {
	boolean pay(String fromMobile, String toMobile, String description, double amount);
}
