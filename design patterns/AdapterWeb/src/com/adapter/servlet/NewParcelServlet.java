package com.adapter.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adapter.bean.adapter.ParcelServiceAdapter;
import com.adapter.valueobject.Address;
import com.adapter.valueobject.ParcelVo;
import com.adapter.valueobject.ReceiptVo;

@WebServlet(urlPatterns = { "/newParcel" })
public class NewParcelServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Address from = null;
		Address to = null;
		ParcelVo parcel = null;
		ParcelServiceAdapter parcelServiceAdapter = null;
		ReceiptVo receipt = null;

		from = new Address(req.getParameter("fromStreetAddress"), req.getParameter("fromCity"),
				req.getParameter("fromState"), req.getParameter("fromZip"), req.getParameter("fromCountry"));
		to = new Address(req.getParameter("toStreetAddress"), req.getParameter("toCity"), req.getParameter("toState"),
				req.getParameter("toZip"), req.getParameter("toCountry"));

		parcel = new ParcelVo();
		parcel.setFrom(from);
		parcel.setTo(to);
		parcel.setShippmentType(req.getParameter("shippmentType"));
		parcel.setWeight(req.getParameter("weight"));

		parcelServiceAdapter = new ParcelServiceAdapter();
		receipt = parcelServiceAdapter.newParcel(parcel);
		req.setAttribute("receipt", receipt);
		req.getRequestDispatcher("/receipt.jsp").forward(req, resp);
	}

}
