package com.airtel.packages;

import java.util.List;
import java.util.UUID;

import com.airtel.dto.Channel;

public class SouthSuperValuePackage extends DTHPackage {

	public SouthSuperValuePackage(String packageName, List<Channel> channels) {
		super(packageName, channels);
	}

	@Override
	public String subscribe(String subscriberNo) {
		return "SSV-" + UUID.randomUUID().toString();
	}

}
