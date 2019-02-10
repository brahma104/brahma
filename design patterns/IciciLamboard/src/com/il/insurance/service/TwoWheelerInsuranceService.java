package com.il.insurance.service;

public class TwoWheelerInsuranceService extends AutomobileInsuranceService {
	protected String engineType;

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	@Override
	protected double estimate() {
		return 2345;
	}

	@Override
	public String toString() {
		return "TwoWheelerInsuranceService [engineType=" + engineType + ", model=" + model + ", make=" + make
				+ ", color=" + color + ", yearManufacturing=" + yearManufacturing + ", vehicleType=" + vehicleType
				+ ", chasisNo=" + chasisNo + ", engineNo=" + engineNo + ", fuelType=" + fuelType + "]";
	}

}
