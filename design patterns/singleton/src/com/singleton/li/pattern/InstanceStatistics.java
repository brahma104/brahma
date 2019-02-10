package com.singleton.li.pattern;

import java.util.Date;

public class InstanceStatistics implements Cloneable {
	protected Date instanceCreatedDate;

	protected InstanceStatistics() {
		instanceCreatedDate = new Date();
	}

	public Date getInstanceCreatedDate() {
		return instanceCreatedDate;
	}

	public void setInstanceCreatedDate(Date instanceCreatedDate) {
		this.instanceCreatedDate = instanceCreatedDate;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((instanceCreatedDate == null) ? 0 : instanceCreatedDate.hashCode());
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
		InstanceStatistics other = (InstanceStatistics) obj;
		if (instanceCreatedDate == null) {
			if (other.instanceCreatedDate != null)
				return false;
		} else if (!instanceCreatedDate.equals(other.instanceCreatedDate))
			return false;
		return true;
	}

}
