package com.pojaxb.test;

import in.ebay.sales.types.PurchaseOrderType;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class POUnMarsahllingTest {
	public static void main(String[] args) throws JAXBException {
		JAXBContext jContext = JAXBContext.newInstance("in.ebay.sales.types");
		Unmarshaller unmarshaller = jContext.createUnmarshaller();
		PurchaseOrderType pot = (PurchaseOrderType) unmarshaller
				.unmarshal(new File(
						"C:\\work\\20180122\\pojaxb\\resource\\po.xml"));
		/* PurchaseOrderType pot = jElement.getValue(); */
		System.out.println("addressLine1 : "
				+ pot.getShippingAddress().getAddressLine1());
	}
}
