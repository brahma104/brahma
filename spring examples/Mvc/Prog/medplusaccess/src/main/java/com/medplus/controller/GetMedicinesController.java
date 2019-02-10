package com.medplus.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.medplus.dto.MedicinesDto;
import com.medplus.service.ManageStockService;

public class GetMedicinesController extends AbstractController {
	private ManageStockService manageStockService;

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView mav = null;
		List<MedicinesDto> medicines = null;

		medicines = manageStockService.getMedicines();
		mav = new ModelAndView();
		mav.addObject("medicines", medicines);
		mav.setViewName("medicines");

		return mav;
	}

	public void setManageStockService(ManageStockService manageStockService) {
		this.manageStockService = manageStockService;
	}

}
