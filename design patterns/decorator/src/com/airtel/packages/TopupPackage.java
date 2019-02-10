package com.airtel.packages;

import java.util.ArrayList;
import java.util.List;

import com.airtel.dto.Channel;

public abstract class TopupPackage extends DTHPackage {
	protected List<Channel> topupChannels;
	protected DTHPackage dthPackage;

	public TopupPackage(DTHPackage dthPackage) {
		this.dthPackage = dthPackage;
		this.topupChannels = new ArrayList<>();
	}

	@Override
	public void setPackageName(String packageName) {
		dthPackage.setPackageName(packageName);
	}

	public void addChannels(List<Channel> topupChannels) {
		dthPackage.addChannels(topupChannels);
	}

	@Override
	public void estimate() {
		dthPackage.estimate();
	}

	@Override
	protected String subscribe(String subscriberNo) {
		return dthPackage.subscribe(subscriberNo);
	}

	@Override
	public String getPackageName() {
		return dthPackage.getPackageName();
	}

	@Override
	public List<Channel> getChannels() {
		return dthPackage.getChannels();
	}

	@Override
	public float getAmount() {
		return dthPackage.getAmount();
	}

}
