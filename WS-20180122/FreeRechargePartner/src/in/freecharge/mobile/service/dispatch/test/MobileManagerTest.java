package in.freecharge.mobile.service.dispatch.test;

import java.io.IOException;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.Service.Mode;
import javax.xml.ws.soap.SOAPBinding;

public class MobileManagerTest {
	private static final String TYP_NMSPC = "http://freerecharge.in/mobile/types";
	private static final String TRG_NMSPC = "http://services.mobile.freerecharge.in/";
	private static final String SERVICE_NM = "MobileManagerService";
	private static final String PORT_NM = "MobileManagerSOAPPort";
	private static final String ENDPOINT_ADDRESS = "http://localhost:8080/FreeRecharge/freerecharge";

	public static void main(String[] args) throws SOAPException, IOException {
		Service mobileManagerService = Service.create(new QName(TRG_NMSPC,
				SERVICE_NM));
		mobileManagerService.addPort(new QName(TRG_NMSPC, PORT_NM),
				SOAPBinding.SOAP11HTTP_BINDING, ENDPOINT_ADDRESS);

		Dispatch<SOAPMessage> dispatch = mobileManagerService.createDispatch(
				new QName(TRG_NMSPC, PORT_NM), SOAPMessage.class, Mode.MESSAGE);
		MessageFactory mFactory = MessageFactory.newInstance();
		SOAPMessage request = mFactory.createMessage();
		SOAPBody body = request.getSOAPBody();

		SOAPElement rcElem = body.addChildElement(new QName(TYP_NMSPC,
				"recharge"));
		// subscriber
		SOAPElement subsElem = rcElem.addChildElement(new QName(TYP_NMSPC,
				"subscriber"));
		SOAPElement mobileElem = subsElem.addChildElement(new QName(TYP_NMSPC,
				"mobileNo"));
		mobileElem.setTextContent("049404");
		SOAPElement providerElem = subsElem.addChildElement(new QName(
				TYP_NMSPC, "providerName"));
		providerElem.setTextContent("Airtel");
		SOAPElement subTypeElem = subsElem.addChildElement(new QName(TYP_NMSPC,
				"subscriberType"));
		subTypeElem.setTextContent("Prepaid");

		// paymentMethod
		SOAPElement pmElem = rcElem.addChildElement(new QName(TYP_NMSPC,
				"paymentMethod"));
		SOAPElement payTypeElem = pmElem.addChildElement(new QName(TYP_NMSPC,
				"paymentType"));
		payTypeElem.setTextContent("Amazon Pay balance");
		SOAPElement amount = pmElem.addChildElement(new QName(TYP_NMSPC,
				"amount"));
		amount.setTextContent("394");

		//request.writeTo(System.out);
		SOAPMessage response = dispatch.invoke(request);
		response.writeTo(System.out);
	}
}











