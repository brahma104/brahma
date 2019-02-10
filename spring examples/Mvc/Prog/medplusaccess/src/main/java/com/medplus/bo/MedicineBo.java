package com.medplus.bo;

import java.io.Serializable;

public class MedicineBo implements Serializable {
	private static final long serialVersionUID = 2047332542876994937L;
	protected int medicineNo;
	protected String medicineName;
	protected int expiryMonth;
	protected int expiryYear;
	protected String manufacturer;
	protected float price;
	protected int quantity;

	public int getMedicineNo() {
		return medicineNo;
	}

	public void setMedicineNo(int medicineNo) {
		this.medicineNo = medicineNo;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public int getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public int getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
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
