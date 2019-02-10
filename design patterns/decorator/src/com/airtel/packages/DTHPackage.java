package com.airtel.packages;

import java.util.List;

import com.airtel.dto.Channel;

public abstract class DTHPackage {
	protected String packageName;
	protected List<Channel> channels;
	protected float amount;

	public DTHPackage() {
		super();
	}

	public DTHPackage(String packageName, List<Channel> channels) {
		this.packageName = packageName;
		this.channels = channels;
	}

	public void addChannels(List<Channel> channels) {
		this.channels.addAll(channels);
	}

	public void estimate() {
		for (int i = 0; i < channels.size(); i++) {
			amount += channels.get(i).getPrice();
		}
	}

	protected abstract String subscribe(String subscriberNo);

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getPackageName() {
		return packageName;
	}

	public List<Channel> getChannels() {
		return channels;
	}

	public float getAmount() {
		return amount;
	}
}
