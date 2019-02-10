package com.medplus2.dto;

public class MedicineDto {
	protected String medicineName;
	protected String manufacturer;
	protected float price;

	public MedicineDto(String medicineName, String manufacturer, float price) {
		super();
		this.medicineName = medicineName;
		this.manufacturer = manufacturer;
		this.price = price;
	}

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

}
