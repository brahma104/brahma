package com.il.insurance.builder;

import com.il.insurance.service.AutomobileInsuranceService;

public abstract class AutomobileInsuranceServiceBuilder {
	protected String model;
	protected String make;
	protected String color;
	protected int yearManufacturing;
	protected String vehicleType;
	protected String chasisNo;
	protected String engineNo;
	protected String fuelType;

	public AutomobileInsuranceServiceBuilder(String model, String make, int yearManufacturing, String vehicleType,
			String chasisNo, String engineNo) {
		this.model = model;
		this.make = make;
		this.yearManufacturing = yearManufacturing;
		this.vehicleType = vehicleType;
		this.chasisNo = chasisNo;
		this.engineNo = engineNo;
	}

	public String model() {
		return model;
	}

	public AutomobileInsuranceServiceBuilder model(String model) {
		this.model = model;
		return this;
	}

	public String make() {
		return make;
	}

	public AutomobileInsuranceServiceBuilder make(String make) {
		this.make = make;
		return this;
	}

	public String color() {
		return color;
	}

	public AutomobileInsuranceServiceBuilder color(String color) {
		this.color = color;
		return this;
	}

	public int yearManufacturing() {
		return yearManufacturing;
	}

	public AutomobileInsuranceServiceBuilder yearManufacturing(int yearManufacturing) {
		this.yearManufacturing = yearManufacturing;
		return this;
	}

	public String vehicleType() {
		return vehicleType;
	}

	public AutomobileInsuranceServiceBuilder vehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
		return this;
	}

	public String chasisNo() {
		return chasisNo;
	}

	public AutomobileInsuranceServiceBuilder chasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
		return this;
	}

	public String engineNo() {
		return engineNo;
	}

	public AutomobileInsuranceServiceBuilder engineNo(String engineNo) {
		this.engineNo = engineNo;
		return this;
	}

	public String fuelType() {
		return fuelType;
	}

	public AutomobileInsuranceServiceBuilder fuelType(String fuelType) {
		this.fuelType = fuelType;
		return this;
	}

	public abstract AutomobileInsuranceService build();

}
