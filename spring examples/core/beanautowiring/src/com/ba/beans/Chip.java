package com.ba.beans;

public class Chip {
	private int chipNo;
	private String manufacturer;

	public void setChipNo(int chipNo) {
		this.chipNo = chipNo;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Chip [chipNo=" + chipNo + ", manufacturer=" + manufacturer + "]";
	}

}
