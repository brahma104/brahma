package com.medplusrpt.dto;

import java.io.Serializable;
import java.util.Date;

public class TransactionDto implements Serializable {
	protected String transactionNo;
	protected Date transactionDate;
	protected String description;
	protected String type;
	protected float amount;

	public TransactionDto(String transactionNo, Date transactionDate, String description, String type, float amount) {
		super();
		this.transactionNo = transactionNo;
		this.transactionDate = transactionDate;
		this.description = description;
		this.type = type;
		this.amount = amount;
	}

	public String getTransactionNo() {
		return transactionNo;
	}

	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

}
