package com.factory.pattern;

import com.factory.bean.Mobile;
import com.factory.bean.RedMi4;
import com.factory.bean.RedMiNote5;
import com.factory.bean.RedMiNote5Plus;

public class RedMiMobileFactory {
	public static Mobile createMobile(String model) {
		Mobile mobile = null;

		if (model != null) {
			if (model.equals("redmi4")) {
				mobile = new RedMi4();
			} else if (model.equals("redminote5")) {
				mobile = new RedMiNote5();
			} else if (model.equals("redminote5plus")) {
				mobile = new RedMiNote5Plus();
			}
		}
		return mobile;
	}
}
