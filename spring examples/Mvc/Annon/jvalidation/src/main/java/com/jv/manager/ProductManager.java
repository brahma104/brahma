package com.jv.manager;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.jv.bean.Product;

public class ProductManager {
	public void storeProduct(Product product) {
		ValidatorFactory validatorFactory = null;
		Validator validator = null;

		validatorFactory = Validation.buildDefaultValidatorFactory();
		validator = validatorFactory.getValidator();
		Set<ConstraintViolation<Product>> constraintViolations = validator.validate(product);
		if (constraintViolations.size() > 0) {
			System.out.println("Following are the errors: ");
			for (ConstraintViolation<Product> constraintViolation : constraintViolations) {
				System.out.println(constraintViolation.getMessage());
			}
		} else {
			System.out.println("storing product");
		}

	}
}









