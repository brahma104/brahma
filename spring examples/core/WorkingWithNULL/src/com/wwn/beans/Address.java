package com.wwn.beans;

public class Address {
	private String addressLine1;
	private String city;
	private int zip;
	private String country;

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", city=" + city + ", zip=" + zip + ", country=" + country
				+ "]";
	}

}
