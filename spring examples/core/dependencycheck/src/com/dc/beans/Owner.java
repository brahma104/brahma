package com.dc.beans;

public class Owner {
	private String firstName;
	private String lastName;

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Owner [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
