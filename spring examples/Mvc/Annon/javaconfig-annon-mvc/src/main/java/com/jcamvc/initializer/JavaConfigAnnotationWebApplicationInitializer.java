package com.jcamvc.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.jcamvc.config.MvcConfig;
import com.jcamvc.config.RootConfig;

public class JavaConfigAnnotationWebApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext rootApplicationContext = null;
		AnnotationConfigWebApplicationContext servletApplicationContext = null;
		ContextLoaderListener contextLoaderListener = null;
		DispatcherServlet dispatcherServlet = null;

		rootApplicationContext = new AnnotationConfigWebApplicationContext();
		rootApplicationContext.register(RootConfig.class);

		servletApplicationContext = new AnnotationConfigWebApplicationContext();
		servletApplicationContext.register(MvcConfig.class);

		contextLoaderListener = new ContextLoaderListener(rootApplicationContext);
		servletContext.addListener(contextLoaderListener);

		dispatcherServlet = new DispatcherServlet(servletApplicationContext);
		ServletRegistration.Dynamic dynamic = servletContext.addServlet("dispatcher", dispatcherServlet);
		dynamic.setLoadOnStartup(2);
		dynamic.addMapping("*.htm");
	}

}
