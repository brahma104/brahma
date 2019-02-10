package com.jv.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		if (value == null || value.trim().length() == 0) {
			return true;
		}

		if (value.startsWith("+") == false) {
			return false;
		}
		if (value.length() != 12 || value.length() != 13) {
			return false;
		}

		return true;
	}

}
