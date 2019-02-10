package com.ca.bo;

import java.util.Date;

public class CompanyBo {
	private int companyNo;
	private String companyName;
	private String description;
	private Date establishedDate;
	private String location;

	public int getCompanyNo() {
		return companyNo;
	}

	public void setCompanyNo(int companyNo) {
		this.companyNo = companyNo;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEstablishedDate() {
		return establishedDate;
	}

	public void setEstablishedDate(Date establishedDate) {
		this.establishedDate = establishedDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "CompanyBo [companyNo=" + companyNo + ", companyName=" + companyName + ", description=" + description
				+ ", establishedDate=" + establishedDate + ", location=" + location + "]";
	}

}
