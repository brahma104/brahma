package com.apollostore.validator;

import java.util.Calendar;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.Validator;

import com.apollostore.command.AddMedicineCommand;
import com.apollostore.util.ValidatorUtil;

public class AddMedicineValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(AddMedicineCommand.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		AddMedicineCommand command = null;

		command = (AddMedicineCommand) target;
		
		if (ValidatorUtil.isEmpty(command.getMedicineName())) {
			errors.rejectValue("medicineName", "medicineName.blank");
		}
		if (ValidatorUtil.isEmpty(command.getManufacturer())) {
			errors.rejectValue("manufacturer", "manufacturer.blank");
		}
		Calendar c = Calendar.getInstance();
		int currentYear = c.get(Calendar.YEAR);
		int currentMonth = c.get(Calendar.MONTH) + 1;

		if ((currentYear == command.getExpiryYear()) && command.getExpiryMonth() <= currentMonth) {
			errors.reject("expiryRange.invalid");
		}
		if (command.getPrice() <= 0) {
			errors.rejectValue("price", "price.zeroOrNegative");
		}
		if (command.getQuantity() <= 0) {
			errors.rejectValue("quantity", "quantity.invalid");
		}

	}

}
