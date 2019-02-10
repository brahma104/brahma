package com.sjbi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sjbi.form.DoctorForm;
import com.sjbi.validator.DoctorFormValidator;

@Controller
@RequestMapping("/add-doctor.htm")
public class AddDoctorFormController {

	private DoctorFormValidator doctorFormValidator;

	@Autowired
	public AddDoctorFormController(DoctorFormValidator doctorFormValidator) {
		this.doctorFormValidator = doctorFormValidator;
	}

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		webDataBinder.addValidators(doctorFormValidator);
	}

	@GetMapping
	public String showDoctorForm(Model model) {
		DoctorForm doctorForm = null;

		doctorForm = new DoctorForm();
		model.addAttribute("doctorForm", doctorForm);
		return "add-doc";
	}

	@PostMapping
	public String addDoctor(@ModelAttribute("doctorForm") @Valid DoctorForm doctorForm, BindingResult errors,
			Model model) {
		if (errors.hasErrors()) {
			return "add-doc";
		}
		model.addAttribute("doctorName", doctorForm.getDoctorName());
		return "doc-added";
	}

}
