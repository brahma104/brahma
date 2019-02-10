package com.pc.dto;

public class Price {
	private String currencyType;
	private float value;

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Price [currencyType=" + currencyType + ", value=" + value + "]";
	}

}
