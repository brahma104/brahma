package com.medplusrpt.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.medplusrpt.command.BankStatementCommand;
import com.medplusrpt.dto.TransactionDto;
import com.medplusrpt.editor.DateFormatEditor;

public class BankStatementFormController extends SimpleFormController {

	@Override
	protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
		binder.registerCustomEditor(Date.class, new DateFormatEditor());
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		List<TransactionDto> transactions = null;
		ModelAndView mav = null;
		BankStatementCommand bsCommand = null;

		bsCommand = (BankStatementCommand) command;

		System.out.println("report Type : " + bsCommand.getReportType());
		transactions = new ArrayList<>();
		transactions.add(new TransactionDto("14", new Date(), "Eswara Store", "CR", 94.45f));
		transactions.add(new TransactionDto("183", new Date(), "Venkateswara Store", "CR", 194.45f));
		transactions.add(new TransactionDto("194", new Date(), "Indian Oil Petrol", "CR", 200f));
		transactions.add(new TransactionDto("049", new Date(), "Airtel Payment Bank", "CR", 878f));
		transactions.add(new TransactionDto("0280", new Date(), "PayTM Mall", "CR", 194.45f));
		transactions.add(new TransactionDto("9389", new Date(), "Amazon India", "CR", 9894.45f));
		mav = new ModelAndView();
		mav.addObject("transactions", transactions);
		mav.addObject("bankStatement", command);
		if (bsCommand.getReportType() == null || bsCommand.getReportType().trim().length() == 0) {
			mav.setViewName("bank-statement");
		} else if (bsCommand.getReportType().equals("pdf")) {
			mav.setViewName("bank-statement-pdf");
		} else if (bsCommand.getReportType().equals("xls")) {
			mav.setViewName("bank-statement-xls");
		}
		return mav;
	}

}










