package in.freerecharge.mobile.services;

import in.freerecharge.mobile.types.PaymentMethod;
import in.freerecharge.mobile.types.Receipt;
import in.freerecharge.mobile.types.Subscriber;

import javax.jws.WebService;

@WebService(endpointInterface = "in.freerecharge.mobile.services.MobileManager", serviceName = "MobileManagerService", portName = "MobileManagerSOAPPort")
public class MobileManagerImpl {

	public Receipt recharge(Subscriber subscriber, PaymentMethod paymentMethod) {
		Receipt receipt = new Receipt();
		receipt.setReceiptNo(subscriber.getSubscriberType()
				+ paymentMethod.getPaymentType());
		receipt.setStatus("success");
		return receipt;
	}

}
