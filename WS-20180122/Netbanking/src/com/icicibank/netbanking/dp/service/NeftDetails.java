package com.icicibank.netbanking.dp.service;

import java.io.Serializable;

public class NeftDetails implements Serializable {
	private float amount;
	private String comments;

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
