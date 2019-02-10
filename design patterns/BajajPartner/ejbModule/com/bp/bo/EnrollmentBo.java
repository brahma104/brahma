package com.bp.bo;

public class EnrollmentBo {
	protected String applicantNo;
	protected String planNo;
	protected int tenure;
	protected double sumInsurred;

	public EnrollmentBo(String applicantNo, String planNo, int tenure, double sumInsurred) {
		super();
		this.applicantNo = applicantNo;
		this.planNo = planNo;
		this.tenure = tenure;
		this.sumInsurred = sumInsurred;
	}

	public String getApplicantNo() {
		return applicantNo;
	}

	public void setApplicantNo(String applicantNo) {
		this.applicantNo = applicantNo;
	}

	public String getPlanNo() {
		return planNo;
	}

	public void setPlanNo(String planNo) {
		this.planNo = planNo;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public double getSumInsurred() {
		return sumInsurred;
	}

	public void setSumInsurred(double sumInsurred) {
		this.sumInsurred = sumInsurred;
	}

}
