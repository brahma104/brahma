package com.idg.entities;

import java.io.Serializable;
import java.util.Date;

public class ServiceRequest implements Serializable {
	protected int serviceRequestNo;
	protected String uniqueProductCode;
	protected String description;
	protected String problem;
	protected Date estimatedDeliveryDate;
	protected float estimatedAmount;
	protected String status;

	public int getServiceRequestNo() {
		return serviceRequestNo;
	}

	public void setServiceRequestNo(int serviceRequestNo) {
		this.serviceRequestNo = serviceRequestNo;
	}

	public String getUniqueProductCode() {
		return uniqueProductCode;
	}

	public void setUniqueProductCode(String uniqueProductCode) {
		this.uniqueProductCode = uniqueProductCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public Date getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}

	public void setEstimatedDeliveryDate(Date estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}

	public float getEstimatedAmount() {
		return estimatedAmount;
	}

	public void setEstimatedAmount(float estimatedAmount) {
		this.estimatedAmount = estimatedAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + Float.floatToIntBits(estimatedAmount);
		result = prime * result + ((estimatedDeliveryDate == null) ? 0 : estimatedDeliveryDate.hashCode());
		result = prime * result + ((problem == null) ? 0 : problem.hashCode());
		result = prime * result + serviceRequestNo;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((uniqueProductCode == null) ? 0 : uniqueProductCode.hashCode());
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
		ServiceRequest other = (ServiceRequest) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (Float.floatToIntBits(estimatedAmount) != Float.floatToIntBits(other.estimatedAmount))
			return false;
		if (estimatedDeliveryDate == null) {
			if (other.estimatedDeliveryDate != null)
				return false;
		} else if (!estimatedDeliveryDate.equals(other.estimatedDeliveryDate))
			return false;
		if (problem == null) {
			if (other.problem != null)
				return false;
		} else if (!problem.equals(other.problem))
			return false;
		if (serviceRequestNo != other.serviceRequestNo)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (uniqueProductCode == null) {
			if (other.uniqueProductCode != null)
				return false;
		} else if (!uniqueProductCode.equals(other.uniqueProductCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ServiceRequest [serviceRequestNo=" + serviceRequestNo + ", uniqueProductCode=" + uniqueProductCode
				+ ", description=" + description + ", problem=" + problem + ", estimatedDeliveryDate="
				+ estimatedDeliveryDate + ", estimatedAmount=" + estimatedAmount + ", status=" + status + "]";
	}

}
