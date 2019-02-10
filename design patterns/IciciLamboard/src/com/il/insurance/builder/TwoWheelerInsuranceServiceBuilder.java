package com.il.insurance.builder;

import com.il.insurance.service.AutomobileInsuranceService;
import com.il.insurance.service.TwoWheelerInsuranceService;

public class TwoWheelerInsuranceServiceBuilder extends AutomobileInsuranceServiceBuilder {
	private String engineType;

	public TwoWheelerInsuranceServiceBuilder(String model, String make, int yearManufacuring, String vehicleType,
			String chasisNo, String engineNo) {
		super(model, make, yearManufacuring, vehicleType, chasisNo, engineNo);
	}

	public String engineType() {
		return engineType;
	}

	public TwoWheelerInsuranceServiceBuilder engineType(String engineType) {
		this.engineType = engineType;
		return this;
	}

	@Override
	public AutomobileInsuranceService build() {
		TwoWheelerInsuranceService twoWheelerInsuranceService = null;

		twoWheelerInsuranceService = new TwoWheelerInsuranceService();
		twoWheelerInsuranceService.setMake(make);
		twoWheelerInsuranceService.setModel(model);
		twoWheelerInsuranceService.setYearManufacturing(yearManufacturing);
		twoWheelerInsuranceService.setVehicleType(vehicleType);
		twoWheelerInsuranceService.setChasisNo(chasisNo);
		twoWheelerInsuranceService.setColor(color);
		twoWheelerInsuranceService.setEngineNo(engineNo);
		twoWheelerInsuranceService.setFuelType(fuelType);
		twoWheelerInsuranceService.setEngineType(engineType);
		return twoWheelerInsuranceService;
	}

}
