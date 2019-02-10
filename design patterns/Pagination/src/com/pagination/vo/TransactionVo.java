package com.pagination.vo;

public class TransactionVo {
	protected String transactionDate;
	protected String description;
	protected String merchant;
	protected String amount;

	public TransactionVo(String transactionDate, String description, String merchant, String amount) {
		super();
		this.transactionDate = transactionDate;
		this.description = description;
		this.merchant = merchant;
		this.amount = amount;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
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

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

}
