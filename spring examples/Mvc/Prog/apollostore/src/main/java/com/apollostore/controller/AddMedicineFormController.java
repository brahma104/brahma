package com.apollostore.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.apollostore.command.AddMedicineCommand;

public class AddMedicineFormController extends SimpleFormController {
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		AddMedicineCommand medicineCommand = null;
		ModelAndView mav = null;

		medicineCommand = (AddMedicineCommand) command;
		mav = new ModelAndView();

		mav.addObject("medicineName", medicineCommand.getMedicineName());
		mav.setViewName("medicine-added-success");
		return mav;
	}

}






