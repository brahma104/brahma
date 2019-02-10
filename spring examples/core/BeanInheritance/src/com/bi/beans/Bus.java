package com.bi.beans;

public class Bus {
	private int busNo;
	private String model;
	private String manufacturer;
	private String color;
	private String fuelType;
	private int mileage;
	private int capacity;
	private float price;

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", model=" + model + ", manufacturer=" + manufacturer + ", color=" + color
				+ ", fuelType=" + fuelType + ", mileage=" + mileage + ", capacity=" + capacity + ", price=" + price
				+ "]";
	}

}
