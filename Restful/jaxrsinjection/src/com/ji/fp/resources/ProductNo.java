package com.ji.fp.resources;

public class ProductNo {
	private int productNo;
	private String category;

	/*public ProductNo(String param) {
		String[] tokens = null;

		tokens = param.split(":");
		productNo = Integer.parseInt(tokens[0]);
		category = tokens[1];
	}*/

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public static ProductNo valueOf(String param) {
		ProductNo productNo = null;
		String[] tokens = null;

		productNo = new ProductNo();
		tokens = param.split(":");
		productNo.setProductNo(Integer.parseInt(tokens[0]));
		productNo.setCategory(tokens[1]);
		return productNo;
	}
	
	

	@Override
	public String toString() {
		return "ProductNo [productNo=" + productNo + ", category=" + category + "]";
	}

}















