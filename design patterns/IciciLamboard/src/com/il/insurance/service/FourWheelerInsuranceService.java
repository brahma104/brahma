package com.il.insurance.service;

public class FourWheelerInsuranceService extends AutomobileInsuranceService {
	protected int capacity;
	protected String usage;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	@Override
	protected double estimate() {
		return 15938;
	}

	@Override
	public String toString() {
		return "FourWheelerInsuranceService [capacity=" + capacity + ", usage=" + usage + ", model=" + model + ", make="
				+ make + ", color=" + color + ", yearManufacturing=" + yearManufacturing + ", vehicleType="
				+ vehicleType + ", chasisNo=" + chasisNo + ", engineNo=" + engineNo + ", fuelType=" + fuelType + "]";
	}

}
