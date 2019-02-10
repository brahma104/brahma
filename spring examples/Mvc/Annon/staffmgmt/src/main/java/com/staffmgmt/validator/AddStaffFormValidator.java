package com.staffmgmt.validator;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.staffmgmt.form.AddStaffForm;

@Component
public class AddStaffFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(AddStaffForm.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		AddStaffForm form = null;

		form = (AddStaffForm) target;
		if (isEmpty(form.getFirstName()) == true) {
			errors.rejectValue("firstName", "firstName.blank");
		}
		if (isEmpty(form.getLastName())) {
			errors.rejectValue("lastName", "lastName.blank");
		}
		if (isEmpty(form.getGender())) {
			errors.rejectValue("gender", "gender.blank");
		}
		if (form.getDob() == null) {
			errors.rejectValue("dob", "dob.blank");
		}
		if (errors.hasFieldErrors("dob") == false) {
			Date today = new Date();
			if (today.compareTo(form.getDob()) < 0) {
				errors.rejectValue("dob", "dob.future");
			}
		}

		if (isEmpty(form.getMobileNo())) {
			errors.rejectValue("mobileNo", "mobile.blank");
		}

		if (isEmpty(form.getEmailAddress())) {
			errors.rejectValue("emailAddress", "emailAddress.blank");
		}

		if (form.getExperience() == null) {
			errors.rejectValue("experience", "experience.blank");
		}
		if (errors.hasFieldErrors("experience") == false) {
			if (form.getExperience() < 0) {
				errors.rejectValue("experience", "experience.invalid");
			}
		}

	}

	private boolean isEmpty(String s) {
		if (s == null || s.trim().length() == 0) {
			return true;
		}
		return false;
	}

}
