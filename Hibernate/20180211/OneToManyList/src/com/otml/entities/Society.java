package com.otml.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Society implements Serializable {
	protected int societyNo;
	protected String societyName;
	protected String societyRegisteredName;
	protected Date registeredDate;
	protected String mobile;
	protected String emailAddress;
	protected List<Staff> staff;

	public int getSocietyNo() {
		return societyNo;
	}

	public void setSocietyNo(int societyNo) {
		this.societyNo = societyNo;
	}

	public String getSocietyName() {
		return societyName;
	}

	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}

	public String getSocietyRegisteredName() {
		return societyRegisteredName;
	}

	public void setSocietyRegisteredName(String societyRegisteredName) {
		this.societyRegisteredName = societyRegisteredName;
	}

	public Date getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
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

	public List<Staff> getStaff() {
		return staff;
	}

	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((registeredDate == null) ? 0 : registeredDate.hashCode());
		result = prime * result + ((societyName == null) ? 0 : societyName.hashCode());
		result = prime * result + societyNo;
		result = prime * result + ((societyRegisteredName == null) ? 0 : societyRegisteredName.hashCode());
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
		Society other = (Society) obj;
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
		if (registeredDate == null) {
			if (other.registeredDate != null)
				return false;
		} else if (!registeredDate.equals(other.registeredDate))
			return false;
		if (societyName == null) {
			if (other.societyName != null)
				return false;
		} else if (!societyName.equals(other.societyName))
			return false;
		if (societyNo != other.societyNo)
			return false;
		if (societyRegisteredName == null) {
			if (other.societyRegisteredName != null)
				return false;
		} else if (!societyRegisteredName.equals(other.societyRegisteredName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Society [societyNo=" + societyNo + ", societyName=" + societyName + ", societyRegisteredName="
				+ societyRegisteredName + ", registeredDate=" + registeredDate + ", mobile=" + mobile
				+ ", emailAddress=" + emailAddress + ", staff=" + staff + "]";
	}

}
