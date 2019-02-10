package com.ja.service;

public class NEFTFundsTrasferServiceImpl implements FundsTransferService {

	@Override
	public String transfer(String fromAc, String toAc, float amount, String comments) {
		System.out.println("neft transfer");
		return "neft-3949405";
	}

}
