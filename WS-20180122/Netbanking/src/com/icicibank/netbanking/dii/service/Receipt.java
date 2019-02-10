package com.icicibank.netbanking.dii.service;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Receipt implements Serializable {
	private String transactionNo;
	private String status;

	public String getTransactionNo() {
		return transactionNo;
	}

	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
