package com.aim.joined.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "technical_staff")
@PrimaryKeyJoinColumn(name = "techinical_staff_no")
public class TechnicalStaff extends Staff {
	protected String primarySkill;
	protected String highestQualification;

	public String getPrimarySkill() {
		return primarySkill;
	}

	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}

	public String getHighestQualification() {
		return highestQualification;
	}

	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((highestQualification == null) ? 0 : highestQualification.hashCode());
		result = prime * result + ((primarySkill == null) ? 0 : primarySkill.hashCode());
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
		TechnicalStaff other = (TechnicalStaff) obj;
		if (highestQualification == null) {
			if (other.highestQualification != null)
				return false;
		} else if (!highestQualification.equals(other.highestQualification))
			return false;
		if (primarySkill == null) {
			if (other.primarySkill != null)
				return false;
		} else if (!primarySkill.equals(other.primarySkill))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TechnicalStaff [primarySkill=" + primarySkill + ", highestQualification=" + highestQualification
				+ ", staffNo=" + staffNo + ", fullName=" + fullName + ", mobile=" + mobile + ", emailAddress="
				+ emailAddress + "]";
	}

}
