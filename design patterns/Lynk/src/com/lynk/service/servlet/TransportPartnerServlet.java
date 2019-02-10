package com.lynk.service.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lynk.partner.factory.LynkServiceFactory;
import com.lynk.partner.factory.PartnerServiceFactory;
import com.lynk.partner.service.TransportPartnerService;

public class TransportPartnerServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String tpsPartner = null;
		String source = null;
		String destination = null;
		Date hireDate = null;
		SimpleDateFormat sdf = null;
		String purpose = null;
		String person = null;
		String mobile = null;
		String emailAddress = null;
		TransportPartnerService transportPartnerService = null;
		PartnerServiceFactory partnerServiceFactory = null;

		try {
			tpsPartner = req.getParameter("tpspartner");
			source = req.getParameter("source");
			destination = req.getParameter("destination");
			sdf = new SimpleDateFormat("dd/MM/yyyy");

			hireDate = sdf.parse(req.getParameter("hireDate"));
			purpose = req.getParameter("purpose");
			person = req.getParameter("tpsPerson");
			mobile = req.getParameter("tpsMobile");
			emailAddress = req.getParameter("tpsEmail");

			partnerServiceFactory = LynkServiceFactory.newPartnerServiceFactory(tpsPartner);
			transportPartnerService = partnerServiceFactory.newTransportPartnerService();
			String reqNo = transportPartnerService.hire(source, destination, hireDate, purpose, person, mobile,
					emailAddress);
			req.setAttribute("reqNo", reqNo);
			req.getRequestDispatcher("/hire-info.jsp").forward(req, resp);
		} catch (Exception e) {
			throw new ServletException(e);
		}

	}

}
