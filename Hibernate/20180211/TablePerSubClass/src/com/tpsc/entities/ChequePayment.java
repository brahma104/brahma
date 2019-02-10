package com.tpsc.entities;

import java.util.Date;

public class ChequePayment extends Payment {
	protected int chequeNo;
	protected Date chequeIssuedDate;
	protected String chequeIssuedName;

	public int getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(int chequeNo) {
		this.chequeNo = chequeNo;
	}

	public Date getChequeIssuedDate() {
		return chequeIssuedDate;
	}

	public void setChequeIssuedDate(Date chequeIssuedDate) {
		this.chequeIssuedDate = chequeIssuedDate;
	}

	public String getChequeIssuedName() {
		return chequeIssuedName;
	}

	public void setChequeIssuedName(String chequeIssuedName) {
		this.chequeIssuedName = chequeIssuedName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((chequeIssuedDate == null) ? 0 : chequeIssuedDate.hashCode());
		result = prime * result + ((chequeIssuedName == null) ? 0 : chequeIssuedName.hashCode());
		result = prime * result + chequeNo;
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
		ChequePayment other = (ChequePayment) obj;
		if (chequeIssuedDate == null) {
			if (other.chequeIssuedDate != null)
				return false;
		} else if (!chequeIssuedDate.equals(other.chequeIssuedDate))
			return false;
		if (chequeIssuedName == null) {
			if (other.chequeIssuedName != null)
				return false;
		} else if (!chequeIssuedName.equals(other.chequeIssuedName))
			return false;
		if (chequeNo != other.chequeNo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ChequePayment [chequeNo=" + chequeNo + ", chequeIssuedDate=" + chequeIssuedDate + ", chequeIssuedName="
				+ chequeIssuedName + ", paymentNo=" + paymentNo + ", paymentDate=" + paymentDate + ", merchantName="
				+ merchantName + ", amount=" + amount + "]";
	}

}
