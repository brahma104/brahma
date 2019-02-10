package org.fireweb.web2.dispatcher;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fireweb.web2.exception.Fireweb2Exception;
import org.fireweb.web2.metadata.Fireweb2Metatadata;

public class Dispatcher {
	public static void dispatch(HttpServletRequest request, HttpServletResponse response, String path,
			String forwardName, Fireweb2Metatadata fireweb2Metatadata) {
		String page = null;
		try {
			page = fireweb2Metatadata.getForwardPage(path, forwardName);
			request.getRequestDispatcher(page).forward(request, response);
		} catch (ServletException | IOException e) {
			throw new Fireweb2Exception("Failed in dispatching view: " + page, e);
		}
	}
}
