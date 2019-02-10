package com.il.insurance.service;

import com.il.insurance.builder.AutomobileInsuranceServiceBuilder;
import com.il.insurance.builder.FourWheelerInsuranceServiceBuilder;
import com.il.insurance.builder.TwoWheelerInsuranceServiceBuilder;

public abstract class AutomobileInsuranceService {
	protected String model;
	protected String make;
	protected String color;
	protected int yearManufacturing;
	protected String vehicleType;
	protected String chasisNo;
	protected String engineNo;
	protected String fuelType;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYearManufacturing() {
		return yearManufacturing;
	}

	public void setYearManufacturing(int yearManufacturing) {
		this.yearManufacturing = yearManufacturing;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getChasisNo() {
		return chasisNo;
	}

	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	protected abstract double estimate();

	public static AutomobileInsuranceServiceBuilder newBuilder(String vehicleType, String model, String make,
			int yearManufacturing, String chasisNo, String engineNo, String fuelType) {
		AutomobileInsuranceServiceBuilder builder = null;

		if (vehicleType.equals("twoWheeler")) {
			builder = new TwoWheelerInsuranceServiceBuilder(model, make, yearManufacturing, vehicleType, chasisNo,
					engineNo);
		} else if (vehicleType.equals("fourWheeler")) {
			builder = new FourWheelerInsuranceServiceBuilder(model, make, yearManufacturing, vehicleType, chasisNo,
					engineNo);
		}
		return builder;
	}
}
