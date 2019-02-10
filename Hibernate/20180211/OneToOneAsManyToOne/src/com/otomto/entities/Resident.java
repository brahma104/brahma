package com.otomto.entities;

import java.io.Serializable;

public class Resident implements Serializable {
	protected int residentNo;
	protected String residentFirstName;
	protected String residentLastName;
	protected String mobile;
	protected String emailAddress;
	protected Flat flat;

	public int getResidentNo() {
		return residentNo;
	}

	public void setResidentNo(int residentNo) {
		this.residentNo = residentNo;
	}

	public String getResidentFirstName() {
		return residentFirstName;
	}

	public void setResidentFirstName(String residentFirstName) {
		this.residentFirstName = residentFirstName;
	}

	public String getResidentLastName() {
		return residentLastName;
	}

	public void setResidentLastName(String residentLastName) {
		this.residentLastName = residentLastName;
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

	public Flat getFlat() {
		return flat;
	}

	public void setFlat(Flat flat) {
		this.flat = flat;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((residentFirstName == null) ? 0 : residentFirstName.hashCode());
		result = prime * result + ((residentLastName == null) ? 0 : residentLastName.hashCode());
		result = prime * result + residentNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resident other = (Resident) obj;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (residentFirstName == null) {
			if (other.residentFirstName != null)
				return false;
		} else if (!residentFirstName.equals(other.residentFirstName))
			return false;
		if (residentLastName == null) {
			if (other.residentLastName != null)
				return false;
		} else if (!residentLastName.equals(other.residentLastName))
			return false;
		if (residentNo != other.residentNo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Resident [residentNo=" + residentNo + ", residentFirstName=" + residentFirstName + ", residentLastName="
				+ residentLastName + ", mobile=" + mobile + ", emailAddress=" + emailAddress + ", flat=" + flat + "]";
	}

}
