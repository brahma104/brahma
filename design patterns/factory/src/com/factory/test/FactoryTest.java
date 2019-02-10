package com.factory.test;

import com.factory.bean.Mobile;
import com.factory.bean.MobileStore;

public class FactoryTest {
	public static void main(String[] args) {
		Mobile mobile = null;
		MobileStore mobileStore = null;
		
		mobileStore = new MobileStore();
		mobile = mobileStore.buy("redminote5plus");
		mobile.call("94859586");
		
	}
}
