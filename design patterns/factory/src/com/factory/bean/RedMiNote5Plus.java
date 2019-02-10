package com.factory.bean;

public class RedMiNote5Plus implements Mobile {
	@Override
	public void call(String mobileNo) {
		System.out.println("calling no : " + mobileNo + " from : " + this.getClass().getSimpleName());
	}

	@Override
	public void message(String mobileNo, String message) {
		System.out.println("message sent to " + mobileNo + " message :" + message + " from : " + " "
				+ this.getClass().getSimpleName());
	}
}
