package com.tm.bo;

import java.util.Date;

public class DemographicInfo {
	protected String fullName;
	protected String aadharNo;
	protected String gender;
	protected Date dob;
	protected String mobile;
	protected String emailAddress;

	public DemographicInfo(String fullName, String aadharNo, String gender, Date dob, String mobile,
			String emailAddress) {
		super();
		this.fullName = fullName;
		this.aadharNo = aadharNo;
		this.gender = gender;
		this.dob = dob;
		this.mobile = mobile;
		this.emailAddress = emailAddress;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
