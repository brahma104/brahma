package com.bi.beans;

import java.beans.ConstructorProperties;

public class Car {
	private int carNo;
	private String model;
	private String manufacturer;
	private String color;
	private String fuelType;
	private int mileage;
	private float price;

	@ConstructorProperties({ "carNo", "model", "manufacturer", "color", "fuelType", "mileage", "price" })
	public Car(int carNo, String model, String manufacturer, String color, String fuelType, int mileage, float price) {
		this.carNo = carNo;
		this.model = model;
		this.manufacturer = manufacturer;
		this.color = color;
		this.fuelType = fuelType;
		this.mileage = mileage;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", model=" + model + ", manufacturer=" + manufacturer + ", color=" + color
				+ ", fuelType=" + fuelType + ", mileage=" + mileage + ", price=" + price + "]";
	}

}
