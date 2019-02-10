package org.fireweb.web.handler;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpServletRequest;

public interface Handler {
	String performAction(HttpServletRequest req, HttpServletResponse resp);
}
