package com.icicibank.netbanking.dii.service;

import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.Call;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.ServiceFactory;

public class NetbankingDIITest {
	private final static String TNS = "http://axisbank.com/netbanking/service";
	private final static String TYPNS = "http://axisbank.com/netbanking/types";
	private final static String ENDPOINT_ADDRESS = "http://localhost:8080/RbiGateway/rbiGateway";
	private final static String PORT_NM = "fundsTransferSOAPPort";
	private final static String SERVICE_NM = "rbiGatewayService";
	private final static String OPERATION_NM = "neft";

	public static void main(String[] args) throws ServiceException,
			RemoteException {
		Account fromAc = null;
		Account toAc = null;
		NeftDetails neftDetails = null;

		ServiceFactory serviceFactory = ServiceFactory.newInstance();
		Service rbiGatewayService = serviceFactory.createService(new QName(TNS,
				SERVICE_NM));
		Call neftCall = rbiGatewayService.createCall(new QName(TNS, PORT_NM));
		neftCall.setOperationName(new QName(TNS, OPERATION_NM));
		neftCall.setTargetEndpointAddress(ENDPOINT_ADDRESS);
		neftCall.addParameter("fromAc", new QName(TYPNS, "account"),
				ParameterMode.IN);
		neftCall.addParameter("toAc", new QName(TYPNS, "account"),
				ParameterMode.IN);
		neftCall.addParameter("neftDetails", new QName(TYPNS, "neftDetails"),
				ParameterMode.IN);
		neftCall.setReturnType(new QName(TYPNS, "receipt"), Receipt.class);
		neftCall.setProperty(Call.SOAPACTION_USE_PROPERTY, true);
		neftCall.setProperty(Call.SOAPACTION_URI_PROPERTY,
				"http://axisbank.com/netbanking/service/neft");
		neftCall.setProperty(Call.ENCODINGSTYLE_URI_PROPERTY,
				"http://schemas.xmlsoap.org/soap/encoding/");

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

		Receipt receipt = (Receipt) neftCall.invoke(new Object[] { fromAc,
				toAc, neftDetails });
		System.out.println("txNo : " + receipt.getTransactionNo());
	}
}




