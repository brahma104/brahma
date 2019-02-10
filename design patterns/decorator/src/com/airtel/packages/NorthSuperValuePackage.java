package com.airtel.packages;

import java.util.List;
import java.util.UUID;

import com.airtel.dto.Channel;

public class NorthSuperValuePackage extends DTHPackage {

	public NorthSuperValuePackage(String packageName, List<Channel> channels) {
		super(packageName, channels);
	}

	@Override
	protected String subscribe(String subscriberNo) {
		return "NSV-" + UUID.randomUUID().toString();
	}

}
