package org.fireweb.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fireweb.web.handler.Handler;
import org.fireweb.web.metadata.FireWebMetadata;
import org.fireweb.web.metadata.handler.helper.HandlerHelper;
import org.fireweb.web.view.helper.Dispatcher;

import com.fireweb.web.metadata.reader.FireWebMetadataReader;
import com.fireweb.web.metadata.reader.FireWebMetadataReaderFactory;

public class FireWebActionServlet extends HttpServlet {
	private FireWebMetadata fireWebMetadata;

	@Override
	public void init(ServletConfig config) throws ServletException {
		FireWebMetadataReader fireWebMetadataReader = null;
		String configFile = null;
		String fileType = null;

		configFile = config.getInitParameter("fireweb-config");
		fileType = configFile.substring(configFile.lastIndexOf("."), configFile.length());
		fireWebMetadataReader = FireWebMetadataReaderFactory.getFireWebMetadataReader(fileType);
		fireWebMetadata = fireWebMetadataReader.readFireWebMetadata(config.getServletContext(), configFile);
		System.out.println("FireWebActionServlet initialized...");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String forwardName = null;
		String requestUri = null;
		Handler handler = null;

		requestUri = req.getServletPath();
		handler = HandlerHelper.getHandler(requestUri, fireWebMetadata);
		forwardName = handler.performAction(req, resp);
		Dispatcher.dispatch(req, resp, requestUri, forwardName, fireWebMetadata);
	}

}













