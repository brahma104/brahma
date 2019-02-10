package com.icicibank.netbanking.dp.service;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.ServiceFactory;

public class NeftDpTest {
	private final static String WSDL_URL = "http://localhost:8080/RbiGateway/rbiGateway?WSDL";
	private final static String TNS = "http://axisbank.com/netbanking/service";
	private final static String SERVICE_NM = "rbiGatewayService";
	private final static String PORT_NM = "fundsTransferSOAPPort";

	public static void main(String[] args) throws ServiceException,
			MalformedURLException, RemoteException {
		Account fromAc = null;
		Account toAc = null;
		NeftDetails neftDetails = null;
		Receipt receipt = null;

		ServiceFactory serviceFactory = ServiceFactory.newInstance();
		Service rbiGatewayService = serviceFactory.createService(
				new java.net.URL(WSDL_URL), new QName(TNS, SERVICE_NM));

		FundsTransfer port = (FundsTransfer) rbiGatewayService.getPort(
				new QName(TNS, PORT_NM), FundsTransfer.class);

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

		receipt = port.neft(fromAc, toAc, neftDetails);
		System.out.println("transactionNo : " + receipt.getTransactionNo());

	}

}
