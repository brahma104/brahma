package com.staffmgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.staffmgmt.form.AddStaffForm;
import com.staffmgmt.validator.AddStaffFormValidator;

@Controller
@RequestMapping("/add-staff.htm")
public class StaffFormController {

	@Autowired
	private AddStaffFormValidator addStaffFormValidator;

	/**
	 * Initial Phase request
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping
	public String showStaffForm(Model model) {
		AddStaffForm addStaffForm = null;

		addStaffForm = new AddStaffForm();
		model.addAttribute("addStaffForm", addStaffForm);
		return "add-staff";
	}

	@PostMapping
	public String addStaff(@ModelAttribute("addStaffForm") AddStaffForm addStaffForm, BindingResult errors,
			Model model) {

		if (addStaffFormValidator.supports(addStaffForm.getClass())) {
			addStaffFormValidator.validate(addStaffForm, errors);
		}
		if (errors.hasErrors()) {
			return "add-staff";
		}

		model.addAttribute("staffName", addStaffForm.getFirstName() + " " + addStaffForm.getLastName());
		return "staff-details";
	}
}
