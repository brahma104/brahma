package com.client.test;

import com.client.waybill.WayBillServiceInvoker;

public class WayBillServiceInvokerTest {
	public static void main(String[] args) {
		WayBillServiceInvoker wbsInvoker = new WayBillServiceInvoker();
		String wbInfo = wbsInvoker.create("This is a way Bill");
		System.out.println(wbInfo);
	}
}
