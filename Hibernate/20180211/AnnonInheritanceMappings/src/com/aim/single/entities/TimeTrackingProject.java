package com.aim.single.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("time-tracking")
public class TimeTrackingProject extends Project {
	protected int hours;
	protected float hourlyRate;

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public float getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(float hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(hourlyRate);
		result = prime * result + hours;
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
		TimeTrackingProject other = (TimeTrackingProject) obj;
		if (Float.floatToIntBits(hourlyRate) != Float.floatToIntBits(other.hourlyRate))
			return false;
		if (hours != other.hours)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TimeTrackingProject [hours=" + hours + ", hourlyRate=" + hourlyRate + ", projectNo=" + projectNo
				+ ", projectName=" + projectName + ", contractor=" + contractor + ", workType=" + workType + "]";
	}

}
