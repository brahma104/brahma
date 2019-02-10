package com.aim.joined.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "non_techinical_staff")
@PrimaryKeyJoinColumn(name = "non_technical_staff_no")
public class NonTechnicalStaff extends Staff {
	protected String workType;
	protected int hoursPerWeek;

	public String getWorkType() {
		return workType;
	}

	public void setWorkType(String workType) {
		this.workType = workType;
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + hoursPerWeek;
		result = prime * result + ((workType == null) ? 0 : workType.hashCode());
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
		NonTechnicalStaff other = (NonTechnicalStaff) obj;
		if (hoursPerWeek != other.hoursPerWeek)
			return false;
		if (workType == null) {
			if (other.workType != null)
				return false;
		} else if (!workType.equals(other.workType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NonTechnicalStaff [workType=" + workType + ", hoursPerWeek=" + hoursPerWeek + ", staffNo=" + staffNo
				+ ", fullName=" + fullName + ", mobile=" + mobile + ", emailAddress=" + emailAddress + "]";
	}

}
