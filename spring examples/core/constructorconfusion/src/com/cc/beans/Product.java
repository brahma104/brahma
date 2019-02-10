package com.cc.beans;

public class Product {
	private int productNo;
	private String description;
	private float amount;

	public Product(int productNo, String description) {
		this.productNo = productNo;
		this.description = description;
	}

	public Product(int productNo, float amount) {
		this.productNo = productNo;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", description=" + description + ", amount=" + amount + "]";
	}

}
