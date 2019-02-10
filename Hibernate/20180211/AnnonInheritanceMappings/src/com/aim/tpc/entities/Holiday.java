package com.aim.tpc.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
abstract public class Holiday implements Serializable {
	@Id
	@Column(name = "package_no")
	@GeneratedValue(generator = "increment_gen")
	@GenericGenerator(name = "increment_gen", strategy = "increment")
	protected int packageNo;
	@Column(name = "package_nm")
	protected String packageName;
	protected int duration;
	protected float amount;

	public int getPackageNo() {
		return packageNo;
	}

	public void setPackageNo(int packageNo) {
		this.packageNo = packageNo;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(amount);
		result = prime * result + duration;
		result = prime * result + ((packageName == null) ? 0 : packageName.hashCode());
		result = prime * result + packageNo;
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
		Holiday other = (Holiday) obj;
		if (Float.floatToIntBits(amount) != Float.floatToIntBits(other.amount))
			return false;
		if (duration != other.duration)
			return false;
		if (packageName == null) {
			if (other.packageName != null)
				return false;
		} else if (!packageName.equals(other.packageName))
			return false;
		if (packageNo != other.packageNo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Holiday [packageNo=" + packageNo + ", packageName=" + packageName + ", duration=" + duration
				+ ", amount=" + amount + "]";
	}

}
