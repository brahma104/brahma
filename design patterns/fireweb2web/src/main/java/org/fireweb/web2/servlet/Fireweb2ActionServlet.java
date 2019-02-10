package org.fireweb.web2.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fireweb.web2.metadata.Fireweb2Metatadata;
import org.fireweb.web2.metadata.reader.Fireweb2ConfigReader;
import org.fireweb.web2.metadata.reader.Fireweb2ConfigReaderFactory;

public class Fireweb2ActionServlet extends HttpServlet {
	private Fireweb2Metatadata fireweb2Metatadata;
	private ApplicationController applicationController;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		applicationController.process(req, resp, fireweb2Metatadata);
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		String configFileLocation = null;
		String configFile = null;
		Fireweb2ConfigReader fireweb2ConfigReader = null;

		configFile = config.getInitParameter("fireweb2config");
		configFileLocation = config.getServletContext().getRealPath("/WEB-INF/") + configFile;
		fireweb2ConfigReader = Fireweb2ConfigReaderFactory
				.createFireweb2ConfigReader(configFile.substring(configFile.lastIndexOf("."), configFile.length()));
		fireweb2Metatadata = fireweb2ConfigReader.readFireweb2Config(configFileLocation);
		applicationController = new ApplicationController();
	}

}
