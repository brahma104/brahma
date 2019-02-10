package com.airtel.packages;

import com.airtel.dto.Channel;

public class KidsTopupPackage extends TopupPackage {

	public KidsTopupPackage(DTHPackage dthPackage) {
		super(dthPackage);
		super.setPackageName("Kids - " + super.getPackageName());
		topupChannels.add(new Channel("hg", "hungama", 7));
		topupChannels.add(new Channel("ik", "ikids", 9));
		topupChannels.add(new Channel("pogo", "pogo", 17));

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
		requestNo = "KTP:" + requestNo;
		return requestNo;
	}

}
