package com.amexaccess.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amexaccess.delegate.EnrollmentDelegate;
import com.amexaccess.vo.EnrollmentRequestVo;

@WebServlet(urlPatterns= {"/newEnrollmentRequest"})
public class NewEnrollmentRequestServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EnrollmentRequestVo vo = null;
		EnrollmentDelegate enrollmentDelegate = null;

		vo = new EnrollmentRequestVo();
		vo.setFirstName(req.getParameter("firstName"));
		vo.setLastName(req.getParameter("lastName"));
		vo.setDob(req.getParameter("dob"));
		vo.setGender(req.getParameter("gender"));
		vo.setMobileNo(req.getParameter("mobile"));
		vo.setEmailAddress(req.getParameter("emailAddress"));
		vo.setPlanNo(req.getParameter("planNo"));
		vo.setTenure(req.getParameter("tenure"));
		vo.setSumInsurred(req.getParameter("sumInussurred"));
		vo.setMedicalRecordDate(req.getParameter("medicalRecordDate"));
		vo.setMedicalTestName(req.getParameter("medicalTestName"));
		vo.setDescription(req.getParameter("description"));
		vo.setMedicalTestResult(req.getParameter("medicalTestResult"));

		enrollmentDelegate = new EnrollmentDelegate();
		try {
			String applicationNo = enrollmentDelegate.newEnrollmentRequest(vo);
			req.setAttribute("applicationNo", applicationNo);
			req.getRequestDispatcher("/enrollment-result.jsp").forward(req, resp);
		} catch (Exception e) {
			throw new ServletException(e);
		}

	}
}
