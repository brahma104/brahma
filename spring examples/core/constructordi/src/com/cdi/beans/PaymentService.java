package com.cdi.beans;

public class PaymentService {
	private Wallet wallet;

	public PaymentService(Wallet wallet) {
		this.wallet = wallet;
	}

	public void bill(String description, float amount, String fromMobile) {
		boolean flag = false;

		flag = wallet.pay(fromMobile, "94849585", description, amount);
		if (flag == true) {
			System.out.println("bill has been paid successfully");
		}
	}
}
