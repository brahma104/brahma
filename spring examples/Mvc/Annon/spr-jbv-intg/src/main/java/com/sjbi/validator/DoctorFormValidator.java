package com.sjbi.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.sjbi.form.DoctorForm;

@Component
public class DoctorFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(DoctorForm.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		DoctorForm doctorForm = null;

		doctorForm = (DoctorForm) target;

		if (errors.hasFieldErrors("doctorName") == false) {
			if (doctorForm.getDoctorName().equals("Mathew")) {
				errors.rejectValue("doctorName", "doctorName.exists");
			}
		}
	}

}
