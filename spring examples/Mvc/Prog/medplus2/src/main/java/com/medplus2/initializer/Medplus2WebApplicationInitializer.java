package com.medplus2.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Medplus2WebApplicationInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		XmlWebApplicationContext servletApplicationContext = null;
		DispatcherServlet dispatcherServlet = null;

		servletApplicationContext = new XmlWebApplicationContext();
		servletApplicationContext.setConfigLocation("/WEB-INF/dispatcher-servlet.xml");

		dispatcherServlet = new DispatcherServlet(servletApplicationContext);
		Dynamic dynamicDispatcherServlet = servletContext.addServlet("dispatcher", dispatcherServlet);
		dynamicDispatcherServlet.setLoadOnStartup(1);
		dynamicDispatcherServlet.addMapping("*.htm");
	}
}
