package com.client.test;

import java.util.Date;

import com.client.uber.UberInvoker;

public class UberInvokerTest {
	public static void main(String[] args) {
		UberInvoker uberInvoker = new UberInvoker();
		String rideStatus = uberInvoker.ride("ameerpet", "madhapur", "cross roads", "cyber towers", new Date(),
				"ap0930", "u093", "34:49");
		System.out.println(rideStatus);
	}
}
