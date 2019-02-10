package com.lynk.service.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lynk.partner.factory.LynkServiceFactory;
import com.lynk.partner.factory.PartnerServiceFactory;
import com.lynk.partner.service.MachineryPartnerService;

public class MachineryPartnerServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mpsPartner = null;
		String area = null;
		String machineryType = null;
		int hours = 0;
		String person = null;
		String mobile = null;
		String emailAddress = null;
		MachineryPartnerService machineryPartnerService = null;
		PartnerServiceFactory partnerServiceFactory = null;

		mpsPartner = req.getParameter("mpspartner");
		area = req.getParameter("area");
		machineryType = req.getParameter("machineryType");
		hours = Integer.parseInt(req.getParameter("hours"));
		person = req.getParameter("mpsPerson");
		mobile = req.getParameter("mpsMobile");
		emailAddress = req.getParameter("mpsEmail");

		try {
			partnerServiceFactory = LynkServiceFactory.newPartnerServiceFactory(mpsPartner);
			machineryPartnerService = partnerServiceFactory.newMachineryPartnerService();
			String reqNo = machineryPartnerService.hire(area, machineryType, hours, person, mobile, emailAddress);
			req.setAttribute("reqNo", reqNo);
			req.getRequestDispatcher("/hire-info.jsp").forward(req, resp);
		} catch (Exception e) {
			throw new ServletException(e);
		}

	}

}
