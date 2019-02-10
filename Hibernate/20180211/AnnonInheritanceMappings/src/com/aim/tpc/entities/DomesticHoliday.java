package com.aim.tpc.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "domestic_holiday")
public class DomesticHoliday extends Holiday {
	protected String travelType;
	protected boolean foodIncluded;

	public String getTravelType() {
		return travelType;
	}

	public void setTravelType(String travelType) {
		this.travelType = travelType;
	}

	public boolean isFoodIncluded() {
		return foodIncluded;
	}

	public void setFoodIncluded(boolean foodIncluded) {
		this.foodIncluded = foodIncluded;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (foodIncluded ? 1231 : 1237);
		result = prime * result + ((travelType == null) ? 0 : travelType.hashCode());
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
		DomesticHoliday other = (DomesticHoliday) obj;
		if (foodIncluded != other.foodIncluded)
			return false;
		if (travelType == null) {
			if (other.travelType != null)
				return false;
		} else if (!travelType.equals(other.travelType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DomesticHoliday [travelType=" + travelType + ", foodIncluded=" + foodIncluded + ", packageNo="
				+ packageNo + ", packageName=" + packageName + ", duration=" + duration + ", amount=" + amount + "]";
	}

}
