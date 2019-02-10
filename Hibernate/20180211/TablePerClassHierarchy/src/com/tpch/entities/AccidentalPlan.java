package com.tpch.entities;

public class AccidentalPlan extends InsurancePlan {
	protected boolean disabilityCoverage;
	protected boolean internationalCoverage;
	protected boolean thirdPartyCoverage;

	public boolean isDisabilityCoverage() {
		return disabilityCoverage;
	}

	public void setDisabilityCoverage(boolean disabilityCoverage) {
		this.disabilityCoverage = disabilityCoverage;
	}

	public boolean isInternationalCoverage() {
		return internationalCoverage;
	}

	public void setInternationalCoverage(boolean internationalCoverage) {
		this.internationalCoverage = internationalCoverage;
	}

	public boolean isThirdPartyCoverage() {
		return thirdPartyCoverage;
	}

	public void setThirdPartyCoverage(boolean thirdPartyCoverage) {
		this.thirdPartyCoverage = thirdPartyCoverage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (disabilityCoverage ? 1231 : 1237);
		result = prime * result + (internationalCoverage ? 1231 : 1237);
		result = prime * result + (thirdPartyCoverage ? 1231 : 1237);
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
		AccidentalPlan other = (AccidentalPlan) obj;
		if (disabilityCoverage != other.disabilityCoverage)
			return false;
		if (internationalCoverage != other.internationalCoverage)
			return false;
		if (thirdPartyCoverage != other.thirdPartyCoverage)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AccidentalPlan [disabilityCoverage=" + disabilityCoverage + ", internationalCoverage="
				+ internationalCoverage + ", thirdPartyCoverage=" + thirdPartyCoverage + ", planNo=" + planNo
				+ ", planName=" + planName + ", minTenure=" + minTenure + ", maxAge=" + maxAge + "]";
	}

}
