package com.airtel.packages;

import com.airtel.dto.Channel;

public class SportsTopupPackage extends TopupPackage {

	public SportsTopupPackage(DTHPackage dthPackage) {
		super(dthPackage);
		super.setPackageName("Sports - " + super.getPackageName());
		topupChannels.add(new Channel("ss1", "start sports1", 12));
		topupChannels.add(new Channel("espn", "espn", 10));
		topupChannels.add(new Channel("sc", "start cricket", 9));

	}

	@Override
	public void estimate() {
		super.addChannels(topupChannels);
		super.estimate();
	}

	@Override
	protected String subscribe(String subscriberNo) {
		String requestNo = null;
		requestNo = super.subscribe(subscriberNo);
		requestNo = "STP:" + requestNo;
		return requestNo;
	}

}
