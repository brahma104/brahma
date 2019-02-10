package com.aim.single.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("fixed-bid")
public class FixedBidProject extends Project {
	protected int duration;
	protected double bidAmount;

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(double bidAmount) {
		this.bidAmount = bidAmount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(bidAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + duration;
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
		FixedBidProject other = (FixedBidProject) obj;
		if (Double.doubleToLongBits(bidAmount) != Double.doubleToLongBits(other.bidAmount))
			return false;
		if (duration != other.duration)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FixedBidProject [duration=" + duration + ", bidAmount=" + bidAmount + ", projectNo=" + projectNo
				+ ", projectName=" + projectName + ", contractor=" + contractor + ", workType=" + workType + "]";
	}

}
