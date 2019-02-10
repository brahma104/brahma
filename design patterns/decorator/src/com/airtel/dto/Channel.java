package com.airtel.dto;

public class Channel {
	protected String code;
	protected String identityName;
	protected float price;

	public Channel(String code, String identityName, float price) {
		this.code = code;
		this.identityName = identityName;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getIdentityName() {
		return identityName;
	}

	public void setIdentityName(String identityName) {
		this.identityName = identityName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
