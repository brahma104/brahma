package com.ja.service;

public class RTGSFundsTransferServiceImpl implements FundsTransferService {

	@Override
	public String transfer(String fromAc, String toAc, float amount, String comments) {
		System.out.println("rtgs funds transfer");
		return "rtgs-39404";
	}

}
