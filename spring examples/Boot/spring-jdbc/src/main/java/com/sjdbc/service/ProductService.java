package com.sjdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sjdbc.dao.ProductDao;

@Service
public class ProductService {
	@Autowired
	private ProductDao productDao;

	@Transactional(readOnly = true)
	public String getProductName(int productNo) {
		return productDao.getProductNameByProductNo(productNo);
	}
}
