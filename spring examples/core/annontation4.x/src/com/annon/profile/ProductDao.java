package com.annon.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDao {
	@Autowired
	private ConnectionFactory connectionFactory;

	public void saveProduct() {
		System.out.println(connectionFactory.getConnection());
	}

}
