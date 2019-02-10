package com.udyog.bo;

public class JobBo {
	private int jobNo;
	private String title;
	private String description;
	private int experience;
	private String location;
	private double offeredSalary;
	private int companyNo;

	public int getJobNo() {
		return jobNo;
	}

	public void setJobNo(int jobNo) {
		this.jobNo = jobNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getOfferedSalary() {
		return offeredSalary;
	}

	public void setOfferedSalary(double offeredSalary) {
		this.offeredSalary = offeredSalary;
	}

	public int getCompanyNo() {
		return companyNo;
	}

	public void setCompanyNo(int companyNo) {
		this.companyNo = companyNo;
	}

}
