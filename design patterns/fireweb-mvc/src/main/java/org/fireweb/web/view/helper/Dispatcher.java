package org.fireweb.web.view.helper;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fireweb.web.exception.DispatcherException;
import org.fireweb.web.metadata.FireWebMetadata;
import org.fireweb.web.metadata.ForwardMetadata;

public class Dispatcher {
	public static void dispatch(HttpServletRequest req, HttpServletResponse resp, String requestUri, String forwardName,
			FireWebMetadata fireWebMetadata) {
		ForwardMetadata forwardMetadata = null;
		String page = null;

		forwardMetadata = fireWebMetadata.getForwardMetdata(requestUri, forwardName);
		page = forwardMetadata.getPage();
		try {
			req.getRequestDispatcher(page).forward(req, resp);
		} catch (ServletException | IOException e) {
			throw new DispatcherException("failed to render the page for forward : " + forwardName, e);
		}
	}
}
