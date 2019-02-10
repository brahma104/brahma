package com.medplus2.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.medplus2.command.SearchMedicineCommand;
import com.medplus2.dto.MedicineDto;

public class SearchMedicineCommandController extends AbstractCommandController {

	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		SearchMedicineCommand smCommand = null;
		List<MedicineDto> medicines = null;
		ModelAndView mav = null;

		smCommand = (SearchMedicineCommand) command;
		medicines = new ArrayList<>();
		medicines.add(new MedicineDto(smCommand.getMedicineName(), smCommand.getManufacturer(), 39));
		medicines.add(new MedicineDto("raxy", "cipla", 39));
		medicines.add(new MedicineDto("alsph", "reddys", 139));
		medicines.add(new MedicineDto("vir93", "reddys", 397));

		mav = new ModelAndView();
		mav.addObject("medicines", medicines);
		mav.setViewName("medicines");

		return mav;
	}

}
