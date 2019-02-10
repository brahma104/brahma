package com.pojaxb.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import in.ebay.sales.types.ItemType;
import in.ebay.sales.types.OrderItemsType;
import in.ebay.sales.types.PurchaseOrderType;
import in.ebay.sales.types.ShippingAddressType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class POMarshallingTest {
	public static void main(String[] args) throws JAXBException, IOException {
		JAXBContext jContext = JAXBContext.newInstance("in.ebay.sales.types");
		Marshaller marshaller = jContext.createMarshaller();
		ItemType item = new ItemType();
		item.setItemCode("ic3");
		item.setQuantity(35);
		
		OrderItemsType orderItems = new OrderItemsType();
		orderItems.getItem().add(item);
		
		ShippingAddressType shippingAddress = new ShippingAddressType();
		shippingAddress.setAddressLine1("505, Mithrivanam");
		shippingAddress.setAddressLine2("X-Roads");
		shippingAddress.setCity("Hyderabad");
		shippingAddress.setState("TS");
		shippingAddress.setZip(394);
		shippingAddress.setCountry("India");
		
		PurchaseOrderType pot = new PurchaseOrderType();
		pot.setOrderItems(orderItems);
		pot.setShippingAddress(shippingAddress);
		FileOutputStream fos = new FileOutputStream(new File("c:\\po.xml"));
		marshaller.marshal(pot, System.out);
		fos.close();
		
	}
}


















