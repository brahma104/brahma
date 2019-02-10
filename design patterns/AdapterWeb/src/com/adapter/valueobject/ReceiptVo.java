package com.adapter.valueobject;

public class ReceiptVo {
	protected String awbNo;
	protected String amount;
	protected String estimatedDateOfDelivery;

	public ReceiptVo(String awbNo, String amount, String estimatedDateOfDelivery) {
		super();
		this.awbNo = awbNo;
		this.amount = amount;
		this.estimatedDateOfDelivery = estimatedDateOfDelivery;
	}

	public String getAwbNo() {
		return awbNo;
	}

	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getEstimatedDateOfDelivery() {
		return estimatedDateOfDelivery;
	}

	public void setEstimatedDateOfDelivery(String estimatedDateOfDelivery) {
		this.estimatedDateOfDelivery = estimatedDateOfDelivery;
	}

}
