package com.sdjpa.service;

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
	public Product findProduct(int productNo) {
		return productRepository.findById(productNo).get();
	}
}
