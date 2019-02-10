package com.dfs.servlet;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/transferFunds" })
public class TransferFundsServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// resp.sendRedirect("tx-details.jsp?txNo=" + UUID.randomUUID().toString());
		req.setAttribute("txNo", UUID.randomUUID().toString());
		req.getRequestDispatcher("/tx-details.jsp").forward(req, resp);
	}

}
