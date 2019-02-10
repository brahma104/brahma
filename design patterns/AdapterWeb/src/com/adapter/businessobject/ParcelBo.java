package com.adapter.businessobject;

public class ParcelBo {
	protected Address from;
	protected Address to;
	protected String shippmentType;
	protected float weight;

	public Address getFrom() {
		return from;
	}

	public void setFrom(Address from) {
		this.from = from;
	}

	public Address getTo() {
		return to;
	}

	public void setTo(Address to) {
		this.to = to;
	}

	public String getShippmentType() {
		return shippmentType;
	}

	public void setShippmentType(String shippmentType) {
		this.shippmentType = shippmentType;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

}
