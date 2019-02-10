package com.ja.test;

import java.lang.reflect.Proxy;

import com.ja.handler.OTPFundsTransferHandler;
import com.ja.service.FundsTransferService;
import com.ja.service.NEFTFundsTrasferServiceImpl;

public class JATest {
	public static void main(String[] args) {
		FundsTransferService fts = (FundsTransferService) Proxy.newProxyInstance(JATest.class.getClassLoader(),
				new Class[] { FundsTransferService.class },
				new OTPFundsTransferHandler(new NEFTFundsTrasferServiceImpl()));
		
		String ref = fts.transfer("ac1", "ta1", 393, "Friend");
		System.out.println(ref);
	}
}
