package com.adapter.businessobject;

import java.util.Date;

public class ReceiptBo {
	protected String awbNo;
	protected float amount;
	protected Date estimatedDateOfDelivery;

	public String getAwbNo() {
		return awbNo;
	}

	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Date getEstimatedDateOfDelivery() {
		return estimatedDateOfDelivery;
	}

	public void setEstimatedDateOfDelivery(Date estimatedDateOfDelivery) {
		this.estimatedDateOfDelivery = estimatedDateOfDelivery;
	}

}
