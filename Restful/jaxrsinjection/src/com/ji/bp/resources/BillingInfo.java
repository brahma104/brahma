package com.ji.bp.resources;

import java.util.List;

import javax.ws.rs.CookieParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.QueryParam;

public class BillingInfo {
	@CookieParam("merchantName")
	protected String merchantName;
	@CookieParam("agentCode")
	protected String agentCode;
	@CookieParam("storeNo")
	protected String storeNo;
	@FormParam("customerName")
	protected String customerName;
	@FormParam("mobile")
	protected String mobile;
	@QueryParam("email")
	protected String emailAddress;
	@FormParam("products")
	protected List<String> products;

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getStoreNo() {
		return storeNo;
	}

	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public List<String> getProducts() {
		return products;
	}

	public void setProducts(List<String> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "BillingInfo [merchantName=" + merchantName + ", agentCode=" + agentCode + ", storeNo=" + storeNo
				+ ", customerName=" + customerName + ", mobile=" + mobile + ", emailAddress=" + emailAddress
				+ ", products=" + products + "]";
	}

}
