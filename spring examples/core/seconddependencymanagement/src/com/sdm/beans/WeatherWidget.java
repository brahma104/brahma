package com.sdm.beans;

public class WeatherWidget {
	private IWeatherForecastor weatherForecastor;

	public void showTemparature(String zipCode) {
		double temparature = 0.0;
		temparature = weatherForecastor.getTemparature(zipCode);
		System.out.println("temparature : " + temparature);
	}

	public void setWeatherForecastor(IWeatherForecastor weatherForecastor) {
		this.weatherForecastor = weatherForecastor;
	}

}
