package com.foodpanda.customer.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.foodpanda.customer.util.Notification;

public class FoodpandaDashboardServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = null;
		Notification notification = null;

		out = resp.getWriter();
		out.println("Loaded by : " + this.getClass().getClassLoader().getClass().getName());
		out.println("Object Id : " + this.getClass().getClassLoader().hashCode());
		notification = new Notification();
		String message = notification.getNotification();
		out.print("<b>" + message + "</b>");
		
		out.println("Notification loaded by : " + notification.getClass().getClassLoader().getClass().getName());
		out.print("Notification Object Id : " + notification.getClass().getClassLoader().hashCode());
		
		out.close();
	}
}







