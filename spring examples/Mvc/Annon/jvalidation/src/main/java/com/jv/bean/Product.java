package com.jv.bean;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.jv.validations.PhoneNumber;

public class Product {
	@Min(value = 1, message = "productNo should not zero or negative")
	private int productNo;
	@NotBlank(message = "productName cannot be empty")
	private String productName;
	@NotBlank(message = "description cannot be empty")
	private String description;
	@Min(value = 1, message = "quantity cannot be zero or negative number")
	private int quantity;
	@Min(value = 1, message = "amount cannot be zero or negative value")
	private float amount;
	@Email(message = "Email Address is not valid")
	private String contactUsEmailAddress;
	@PhoneNumber(message = "PhoneNumber should be 12 or 13 digits and should start with + and country code")
	private String phoneNumber;

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getContactUsEmailAddress() {
		return contactUsEmailAddress;
	}

	public void setContactUsEmailAddress(String contactUsEmailAddress) {
		this.contactUsEmailAddress = contactUsEmailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
