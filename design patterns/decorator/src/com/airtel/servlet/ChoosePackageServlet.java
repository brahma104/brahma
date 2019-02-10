package com.airtel.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airtel.manager.PackageManager;
import com.airtel.packages.DTHPackage;

public class ChoosePackageServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String packageName = null;
		String[] topups = null;
		List<String> selectedToups = null;
		DTHPackage dthPackage = null;

		packageName = req.getParameter("package");
		topups = req.getParameterValues("topup");
		selectedToups = Arrays.asList(topups);
		dthPackage = PackageManager.getPackage(packageName, selectedToups);
		dthPackage.estimate();
		req.setAttribute("dthPackage", dthPackage);
		req.getRequestDispatcher("/package-details.jsp").forward(req, resp);

	}

}
