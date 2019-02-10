package com.amex.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bajajallianz.dto.PolicyDto;
import com.bajajallianz.service.MedicalPolicyService;
import com.bajajallianz.util.MedicalPolicyServiceFactory;

@WebServlet(urlPatterns = { "/amexpolicies" })
public class AmexPolicyServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MedicalPolicyService medicalPolicyService = null;
		List<PolicyDto> policies = null;

		try {
			medicalPolicyService = MedicalPolicyServiceFactory.getMedicalPolicyService("amex");
			policies = medicalPolicyService.getPolicies();
			req.setAttribute("policies", policies);
			req.getRequestDispatcher("/amex-policies.jsp").forward(req, resp);
		} catch (SQLException e) {
			throw new ServletException(e);
		}

	}

}
