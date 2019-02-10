package com.il.insurance.builder;

import com.il.insurance.service.AutomobileInsuranceService;
import com.il.insurance.service.FourWheelerInsuranceService;

public class FourWheelerInsuranceServiceBuilder extends AutomobileInsuranceServiceBuilder {
	private int capacity;
	private String usage;

	public FourWheelerInsuranceServiceBuilder(String model, String make, int yearManufacuring, String vehicleType,
			String chasisNo, String engineNo) {
		super(model, make, yearManufacuring, vehicleType, chasisNo, engineNo);
	}

	public int capacity() {
		return capacity;
	}

	public FourWheelerInsuranceServiceBuilder capacity(int capacity) {
		this.capacity = capacity;
		return this;
	}

	public String usage() {
		return usage;
	}

	public FourWheelerInsuranceServiceBuilder usage(String usage) {
		this.usage = usage;
		return this;
	}

	@Override
	public AutomobileInsuranceService build() {
		FourWheelerInsuranceService fourWheelerInsuranceService = null;

		fourWheelerInsuranceService = new FourWheelerInsuranceService();
		fourWheelerInsuranceService.setCapacity(capacity);
		fourWheelerInsuranceService.setChasisNo(chasisNo);
		fourWheelerInsuranceService.setColor(color);
		fourWheelerInsuranceService.setEngineNo(engineNo);
		fourWheelerInsuranceService.setFuelType(fuelType);
		fourWheelerInsuranceService.setMake(make);
		fourWheelerInsuranceService.setModel(model);
		fourWheelerInsuranceService.setUsage(usage);
		fourWheelerInsuranceService.setVehicleType(vehicleType);
		fourWheelerInsuranceService.setYearManufacturing(yearManufacturing);
		return fourWheelerInsuranceService;
	}

}
