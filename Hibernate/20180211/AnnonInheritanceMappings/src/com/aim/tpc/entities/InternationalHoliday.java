package com.aim.tpc.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "international_holiday")
public class InternationalHoliday extends Holiday {
	protected boolean passportRequired;
	protected boolean visaRequired;

	public boolean isPassportRequired() {
		return passportRequired;
	}

	public void setPassportRequired(boolean passportRequired) {
		this.passportRequired = passportRequired;
	}

	public boolean isVisaRequired() {
		return visaRequired;
	}

	public void setVisaRequired(boolean visaRequired) {
		this.visaRequired = visaRequired;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (passportRequired ? 1231 : 1237);
		result = prime * result + (visaRequired ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		InternationalHoliday other = (InternationalHoliday) obj;
		if (passportRequired != other.passportRequired)
			return false;
		if (visaRequired != other.visaRequired)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "InternationalHoliday [passportRequired=" + passportRequired + ", visaRequired=" + visaRequired
				+ ", packageNo=" + packageNo + ", packageName=" + packageName + ", duration=" + duration + ", amount="
				+ amount + "]";
	}

}
