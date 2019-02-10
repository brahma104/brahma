package com.tpch.entities;

import java.io.Serializable;

public class InsurancePlan implements Serializable {
	protected int planNo;
	protected String planName;
	protected int minTenure;
	protected int maxAge;

	public int getPlanNo() {
		return planNo;
	}

	public void setPlanNo(int planNo) {
		this.planNo = planNo;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public int getMinTenure() {
		return minTenure;
	}

	public void setMinTenure(int minTenure) {
		this.minTenure = minTenure;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maxAge;
		result = prime * result + minTenure;
		result = prime * result + ((planName == null) ? 0 : planName.hashCode());
		result = prime * result + planNo;
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
		InsurancePlan other = (InsurancePlan) obj;
		if (maxAge != other.maxAge)
			return false;
		if (minTenure != other.minTenure)
			return false;
		if (planName == null) {
			if (other.planName != null)
				return false;
		} else if (!planName.equals(other.planName))
			return false;
		if (planNo != other.planNo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "InsurancePlan [planNo=" + planNo + ", planName=" + planName + ", minTenure=" + minTenure + ", maxAge="
				+ maxAge + "]";
	}

}
