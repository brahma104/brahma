package com.sjdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	private final String SQL_FIND_PRODUCT_NM_BY_ID = "select product_nm from product where product_no = ?";
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public String getProductNameByProductNo(int productNo) {
		return jdbcTemplate.queryForObject(SQL_FIND_PRODUCT_NM_BY_ID, String.class, new Object[] { productNo });
	}
}
