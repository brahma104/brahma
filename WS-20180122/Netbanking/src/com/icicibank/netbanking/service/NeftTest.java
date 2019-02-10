package com.icicibank.netbanking.service;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class NeftTest {
	public static void main(String[] args) throws ServiceException, RemoteException {
		RbiGatewayService rbiGatewayService = null;
		FundsTransfer fundsTransfer = null;
		Account fromAc = null;
		Account toAc = null;
		NeftDetails neftDetails = null;
		Receipt receipt = null;

		fromAc = new Account();
		fromAc.setAccountNo("icici03930");
		fromAc.setAccountHolderName("Ram");
		fromAc.setIfscCode("icici003000");

		toAc = new Account();
		toAc.setAccountNo("sbi0393");
		toAc.setAccountHolderName("Sam");
		toAc.setIfscCode("sbi03030");

		neftDetails = new NeftDetails();
		neftDetails.setAmount(9394);
		neftDetails.setComments("Friends");

		rbiGatewayService = new RbiGatewayService_Impl();
		fundsTransfer = rbiGatewayService.getFundsTransferSOAPPort();
		receipt = fundsTransfer.neft(fromAc, toAc, neftDetails);
		System.out.println("transactionNo : " + receipt.getTransactionNo());
	}

}









