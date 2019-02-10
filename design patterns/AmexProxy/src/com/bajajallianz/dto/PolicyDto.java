package com.bajajallianz.dto;

public class PolicyDto {
	protected int policyNo;
	protected String policyName;
	protected String policyType;
	protected int minTenure;
	protected int maxTenure;
	protected float premiumAmount;
	protected String providerId;

	public PolicyDto(int policyNo, String policyName, String policyType, int minTenure, int maxTenure,
			float premiumAmount, String providerId) {
		this.policyNo = policyNo;
		this.policyName = policyName;
		this.policyType = policyType;
		this.minTenure = minTenure;
		this.maxTenure = maxTenure;
		this.premiumAmount = premiumAmount;
		this.providerId = providerId;
	}

	public int getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public int getMinTenure() {
		return minTenure;
	}

	public void setMinTenure(int minTenure) {
		this.minTenure = minTenure;
	}

	public int getMaxTenure() {
		return maxTenure;
	}

	public void setMaxTenure(int maxTenure) {
		this.maxTenure = maxTenure;
	}

	public float getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(float premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

}
