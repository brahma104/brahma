package com.wwn.beans;

public class Plot {
	private String location;
	private int area;
	private Address address;

	public Plot(String location, int area, Address address) {
		super();
		this.location = location;
		this.area = area;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Plot [location=" + location + ", area=" + area + ", address=" + address + "]";
	}

}
