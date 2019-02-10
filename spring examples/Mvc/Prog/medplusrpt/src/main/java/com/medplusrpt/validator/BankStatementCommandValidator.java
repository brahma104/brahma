package com.medplusrpt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.medplusrpt.command.BankStatementCommand;

public class BankStatementCommandValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return BankStatementCommand.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		BankStatementCommand command = null;

		command = (BankStatementCommand) target;

		if (command.getAcNo() == null || command.getAcNo().trim().length() == 0) {
			errors.rejectValue("acNo", "accNo.blank");
		}
	}

}
