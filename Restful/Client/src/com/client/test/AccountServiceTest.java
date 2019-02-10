package com.client.test;

import com.client.account.AccountServiceInvoker;

public class AccountServiceTest {
	public static void main(String[] args) {
		AccountServiceInvoker accountService = new AccountServiceInvoker();
		String status = accountService.neftStatus("ac039", 9303);
		System.out.println("status : " + status);
	}
}
