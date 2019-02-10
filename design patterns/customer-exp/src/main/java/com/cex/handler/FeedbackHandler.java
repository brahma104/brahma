package com.cex.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fireweb.web.handler.Handler;

public class FeedbackHandler implements Handler {

	@Override
	public String performAction(HttpServletRequest req, HttpServletResponse resp) {
		String person = null;

		person = req.getParameter("name");
		req.setAttribute("name", person);

		return "feedback-success";
	}

}
