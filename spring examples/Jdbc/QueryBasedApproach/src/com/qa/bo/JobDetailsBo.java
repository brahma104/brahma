package com.qa.bo;

import java.util.List;

public class JobDetailsBo {
	private int jobNo;
	private String title;
	private String description;
	private double offeredSalary;
	private String location;
	private CompanyBo company;
	private List<SkillBo> skills;

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

	public double getOfferedSalary() {
		return offeredSalary;
	}

	public void setOfferedSalary(double offeredSalary) {
		this.offeredSalary = offeredSalary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public CompanyBo getCompany() {
		return company;
	}

	public void setCompany(CompanyBo company) {
		this.company = company;
	}

	public List<SkillBo> getSkills() {
		return skills;
	}

	public void setSkills(List<SkillBo> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "JobDetailsBo [jobNo=" + jobNo + ", title=" + title + ", description=" + description + ", offeredSalary="
				+ offeredSalary + ", location=" + location + ", company=" + company + ", skills=" + skills + "]";
	}

}
