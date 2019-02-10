package com.factory.bean;

import com.factory.pattern.RedMiMobileFactory;

public class MobileStore {
	public Mobile buy(String model) {
		Mobile mobile = null;

		mobile = RedMiMobileFactory.createMobile(model);
		return mobile;
	}
}
