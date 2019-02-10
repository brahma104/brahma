package com.cpe.beans;

public class Address {
	private String building;
	private String street;
	private String city;
	private String state;
	private int zip;
	private String country;
	private GeoLocation geoLocation;

	public void setBuilding(String building) {
		this.building = building;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setGeoLocation(GeoLocation geoLocation) {
		this.geoLocation = geoLocation;
	}

	@Override
	public String toString() {
		return "Address [building=" + building + ", street=" + street + ", city=" + city + ", state=" + state + ", zip="
				+ zip + ", country=" + country + ", geoLocation=" + geoLocation + "]";
	}

}
