package com.sdm.beans;

public class OracleWeatherForecastorImpl implements IWeatherForecastor {

	@Override
	public double getTemparature(String zipCode) {
		System.out.println("connecting to oracle hardware...");
		return 13.2;
	}

}
