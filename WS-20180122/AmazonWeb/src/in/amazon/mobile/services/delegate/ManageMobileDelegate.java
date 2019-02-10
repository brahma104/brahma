package in.amazon.mobile.services.delegate;

import java.io.IOException;
import java.util.Calendar;

import javax.xml.datatype.XMLGregorianCalendar;

import in.amazon.mobile.services.helper.FreeRechargeServiceLocator;
import in.amazon.mobile.services.valueobjects.RechargeStatusVo;
import in.amazon.mobile.services.valueobjects.RechargeVo;
import in.freerecharge.mobile.services.MobileManager;
import in.freerecharge.mobile.types.PaymentMethod;
import in.freerecharge.mobile.types.Receipt;
import in.freerecharge.mobile.types.Subscriber;

public class ManageMobileDelegate {
	public RechargeStatusVo recharge(RechargeVo recharge) {
		RechargeStatusVo rechargeStatusVo = null;
		Subscriber subscriber = null;
		PaymentMethod paymentMethod = null;
		Receipt receipt = null;
		MobileManager port = null;
		FreeRechargeServiceLocator freeRechargeServiceLocator = null;

		subscriber = new Subscriber();
		subscriber.setMobileNo(recharge.getMobileNo());
		subscriber.setProviderName(recharge.getProvider());
		subscriber.setSubscriberType(recharge.getSubscriberType());

		paymentMethod = new PaymentMethod();
		paymentMethod.setPaymentType(recharge.getPaymentType());
		paymentMethod.setAmount(Float.parseFloat(recharge.getAmount()));

		freeRechargeServiceLocator = new FreeRechargeServiceLocator();
		try {
			port = freeRechargeServiceLocator.getMobileManagerPort();
			receipt = port.recharge(subscriber, paymentMethod);
			rechargeStatusVo = new RechargeStatusVo();
			rechargeStatusVo.setReceiptNo(receipt.getReceiptNo());
			rechargeStatusVo.setMessage(receipt.getStatus());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rechargeStatusVo;
	}
}
