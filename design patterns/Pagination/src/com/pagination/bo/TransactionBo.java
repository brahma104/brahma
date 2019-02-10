package com.pagination.bo;

import java.util.Date;

public class TransactionBo {
	protected int transactionNo;
	protected Date transactionDate;
	protected String description;
	protected String merchant;
	protected float amount;

	public TransactionBo(int transactionNo, Date transactionDate, String description, String merchant, float amount) {
		super();
		this.transactionNo = transactionNo;
		this.transactionDate = transactionDate;
		this.description = description;
		this.merchant = merchant;
		this.amount = amount;
	}

	public int getTransactionNo() {
		return transactionNo;
	}

	public void setTransactionNo(int transactionNo) {
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

	public String getMerchant() {
		return merchant;
	}

	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

}
