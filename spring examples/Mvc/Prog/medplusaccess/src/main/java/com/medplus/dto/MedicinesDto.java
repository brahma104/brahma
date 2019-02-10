package com.medplus.dto;

import java.io.Serializable;

public class MedicinesDto implements Serializable {
	private static final long serialVersionUID = 2479514945853095550L;
	protected String medicineName;
	protected String manufacturer;
	protected float price;
	protected int quantity;

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
