package com.pagination.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pagination.businessdelegate.AccountDelegate;
import com.pagination.helper.ObjectFactory;
import com.pagination.vo.TransactionVo;

@WebServlet(urlPatterns = { "/transactionHistory" })
public class TransactionHistoryServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sortColumn = null;
		String sortOrder = null;
		int pageSize = 0;
		int currentPage = 0;
		int totalRecords = 0;
		int totalPages = 0;
		String action = null;
		AccountDelegate accountDelegate = null;
		ObjectFactory objectFactory = null;
		List<TransactionVo> transactions = null;

		objectFactory = ObjectFactory.getInstance();
		accountDelegate = (AccountDelegate) objectFactory.getObject("com.pagination.businessdelegate.AccountDelegate");

		action = req.getParameter("action");
		// first request
		if (action == null || action.trim().length() == 0) {
			pageSize = 5;
			currentPage = 1;
			sortColumn = "transaction_dt";
			sortOrder = "asc";
		} else {
			currentPage = Integer.parseInt(req.getParameter("currentPage"));
			sortColumn = req.getParameter("sortColumn");
			sortOrder = req.getParameter("sortOrder");
			pageSize = Integer.parseInt(req.getParameter("pageSize"));
		}
		totalRecords = accountDelegate.getNoOfTransactions();
		totalPages = (int) Math.ceil((totalRecords / pageSize));

		if (action != null && action.trim().length() > 0) {
			if (action.equals("next")) {
				currentPage++;
			} else if (action.equals("prev")) {
				currentPage--;
			} else if (action.equals("first")) {
				currentPage = 1;
			} else if (action.equals("last")) {
				currentPage = totalPages;
			}
		}

		transactions = accountDelegate.getTransactionHistory(pageSize, currentPage, sortColumn, sortOrder);
		req.setAttribute("transactions", transactions);
		req.setAttribute("totalPages", totalPages);
		req.setAttribute("pageSize", pageSize);
		req.setAttribute("currentPage", currentPage);
		req.setAttribute("sortColumn", sortColumn);
		req.setAttribute("sortOrder", sortOrder);
		
		req.getRequestDispatcher("/transaction-history.jsp").forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

}
