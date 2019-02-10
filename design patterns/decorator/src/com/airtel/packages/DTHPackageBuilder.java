package com.airtel.packages;

import java.util.ArrayList;
import java.util.List;

import com.airtel.dto.Channel;

public class DTHPackageBuilder {
	protected String packageName;
	protected List<Channel> channels;

	public DTHPackageBuilder(String packageName) {
		this.packageName = packageName;
		this.channels = new ArrayList<>();
	}

	public DTHPackageBuilder channel(String code, String identityName, float price) {
		channels.add(new Channel(code, identityName, price));
		return this;
	}

	public DTHPackage build() {
		DTHPackage dthPackage = null;

		if (packageName.equals("south super value")) {
			dthPackage = new SouthSuperValuePackage(packageName, channels);
		} else if (packageName.equalsIgnoreCase("north super value")) {
			dthPackage = new NorthSuperValuePackage(packageName, channels);
		}
		return dthPackage;
	}

}
