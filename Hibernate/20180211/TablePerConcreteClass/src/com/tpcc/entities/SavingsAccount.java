package com.tpcc.entities;

public class SavingsAccount extends Account {
	protected int minBalance;
	protected boolean hasCheckBookFacility;
	protected int maxWithdrawlLimit;

	public int getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}

	public boolean isHasCheckBookFacility() {
		return hasCheckBookFacility;
	}

	public void setHasCheckBookFacility(boolean hasCheckBookFacility) {
		this.hasCheckBookFacility = hasCheckBookFacility;
	}

	public int getMaxWithdrawlLimit() {
		return maxWithdrawlLimit;
	}

	public void setMaxWithdrawlLimit(int maxWithdrawlLimit) {
		this.maxWithdrawlLimit = maxWithdrawlLimit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (hasCheckBookFacility ? 1231 : 1237);
		result = prime * result + maxWithdrawlLimit;
		result = prime * result + minBalance;
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
		SavingsAccount other = (SavingsAccount) obj;
		if (hasCheckBookFacility != other.hasCheckBookFacility)
			return false;
		if (maxWithdrawlLimit != other.maxWithdrawlLimit)
			return false;
		if (minBalance != other.minBalance)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SavingsAccount [minBalance=" + minBalance + ", hasCheckBookFacility=" + hasCheckBookFacility
				+ ", maxWithdrawlLimit=" + maxWithdrawlLimit + ", accountNo=" + accountNo + ", accountHolderName="
				+ accountHolderName + ", openedDate=" + openedDate + ", amount=" + amount + "]";
	}

}
