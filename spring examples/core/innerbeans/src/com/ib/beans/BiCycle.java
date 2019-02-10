package com.ib.beans;

public class BiCycle {
	private int biCycleNo;
	private String manufacturer;
	private Chain chain;

	public void setBiCycleNo(int biCycleNo) {
		this.biCycleNo = biCycleNo;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setChain(Chain chain) {
		this.chain = chain;
	}

	@Override
	public String toString() {
		return "BiCycle [biCycleNo=" + biCycleNo + ", manufacturer=" + manufacturer + ", chain=" + chain + "]";
	}

}
