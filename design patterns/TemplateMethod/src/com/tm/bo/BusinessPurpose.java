package com.tm.bo;

import java.util.Date;

public class BusinessPurpose {
	protected String businessName;
	protected String category;
	protected String place;
	protected long capitalAmount;
	protected Date establishedDate;
	protected String businessPhone;

	public BusinessPurpose(String businessName, String category, String place, long capitalAmount, Date establishedDate,
			String businessPhone) {
		super();
		this.businessName = businessName;
		this.category = category;
		this.place = place;
		this.capitalAmount = capitalAmount;
		this.establishedDate = establishedDate;
		this.businessPhone = businessPhone;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public long getCapitalAmount() {
		return capitalAmount;
	}

	public void setCapitalAmount(long capitalAmount) {
		this.capitalAmount = capitalAmount;
	}

	public Date getEstablishedDate() {
		return establishedDate;
	}

	public void setEstablishedDate(Date establishedDate) {
		this.establishedDate = establishedDate;
	}

	public String getBusinessPhone() {
		return businessPhone;
	}

	public void setBusinessPhone(String businessPhone) {
		this.businessPhone = businessPhone;
	}

}
