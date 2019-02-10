package com.sdjpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sdjpa.config.RootConfig;
import com.sdjpa.entities.Product;
import com.sdjpa.service.ProductService;

public class JpaTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
		ProductService productService = context.getBean("productService", ProductService.class);
		/*
		 * Product product = new Product(); product.setProductName("Water Bottle");
		 * product.setDescription("Tupper ware bottle"); product.setPrice(934);
		 * product.setStatus(1); int productNo = productService.addProduct(product);
		 * System.out.println("productNo : " + productNo);
		 */
		/*Optional<Product> op = productService.getProduct(2);
		Product product = op.get();
		product.setProductName("High quality water bottle");
		productService.updateProduct(product);*/
		//List<Product> products = productService.getProductByPrice(900);
		//List<Product> products = productService.getProductsBetweenThePrice(900, 10000);
		//List<Product> products = productService.getProductsByPriceAndStatus(900, 1);
		/*int r = productService.updateProductStatus(1, 0);
		System.out.println("records : " + r);*/
		/*List<Product> products = productService.getProductsByProductNameAndPrice("Bottle", 100);
		for (Product product1 : products) {
			System.out.println(product1);
		}*/
		int c = productService.countProductsByStatus(1);
		System.out.println(c);
	}
}
















