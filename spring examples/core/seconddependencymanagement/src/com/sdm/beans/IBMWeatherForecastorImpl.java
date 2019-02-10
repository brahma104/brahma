package com.sdm.beans;

public class IBMWeatherForecastorImpl implements IWeatherForecastor {

	@Override
	public double getTemparature(String zipCode) {
		System.out.println("connecting to ibm hardware....");
		return 12.01;
	}

}
