package com.ba.beans;

public class Toy {
	private int toyNo;
	private String toyName;
	private String description;
	private int ageGroup;

	public Toy(int toyNo, String toyName, String description, int ageGroup) {
		super();
		this.toyNo = toyNo;
		this.toyName = toyName;
		this.description = description;
		this.ageGroup = ageGroup;
	}

	@Override
	public String toString() {
		return "Toy [toyNo=" + toyNo + ", toyName=" + toyName + ", description=" + description + ", ageGroup="
				+ ageGroup + "]";
	}

}
