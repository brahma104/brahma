package org.lic.insurance.types;

public class PolicyInfo {
	private String policyNo;
	private int tenure;
	private float sumInsurred;

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public float getSumInsurred() {
		return sumInsurred;
	}

	public void setSumInsurred(float sumInsurred) {
		this.sumInsurred = sumInsurred;
	}

}
