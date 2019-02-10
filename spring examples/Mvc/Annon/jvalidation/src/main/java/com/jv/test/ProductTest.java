package com.jv.test;

import com.jv.bean.Product;
import com.jv.manager.ProductManager;

public class ProductTest {
	public static void main(String[] args) {
		Product product = new Product();
		product.setAmount(-1);
		product.setDescription("Television");
		product.setQuantity(0);
		product.setContactUsEmailAddress("contactus@xya.com");
		product.setPhoneNumber("039");
		ProductManager productManager = new ProductManager();
		productManager.storeProduct(product);
	}
}
