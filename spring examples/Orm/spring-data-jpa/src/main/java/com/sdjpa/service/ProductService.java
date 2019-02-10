package com.sdjpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sdjpa.entities.Product;
import com.sdjpa.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Transactional(readOnly = false)
	public Integer addProduct(Product product) {
		product = productRepository.save(product);
		return product.getProductNo();
	}

	@Transactional(readOnly = false)
	public List<Product> getProducts() {
		return productRepository.findAll();
	}

	@Transactional(readOnly = true)
	public Optional<Product> getProduct(int productNo) {
		return productRepository.findById(productNo);
	}

	@Transactional(readOnly = false)
	public void updateProduct(Product product) {
		productRepository.save(product);
	}

	@Transactional(readOnly = true)
	public List<Product> getProductByPrice(float price) {
		return productRepository.findProductByPriceGreaterThan(price);
	}

	public List<Product> getProductsBetweenThePrice(float minPrice, float maxPrice) {
		return productRepository.findProductByPriceBetween(minPrice, maxPrice);
	}

	public List<Product> getProductsByPriceAndStatus(float price, int status) {
		return productRepository.findProductByPriceGreaterThanAndStatus(price, status);
	}

	public List<Product> getProductsByProductNameAndPrice(String productName, float price) {
		return productRepository.getProductsByNameAndPrice("%" + productName + "%", price);
	}

	@Transactional(readOnly = true)
	public int updateProductStatus(int productNo, int status) {
		return productRepository.updateStatusByProductId(productNo, status);
	}

	@Transactional(readOnly = false)
	public int countProductsByStatus(int status) {
		return productRepository.countProductsByStatus(status);
	}
}
