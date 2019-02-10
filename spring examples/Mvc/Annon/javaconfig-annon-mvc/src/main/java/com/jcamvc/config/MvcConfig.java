package com.jcamvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class MvcConfig {

	/**
	 * BeanNameUrlHandlerMapping will maps the request
	 * 
	 * @return
	 */
	@Bean(name = "/dashboard.htm")
	public Controller dashboard() {
		ParameterizableViewController parameterizableViewController = null;

		parameterizableViewController = new ParameterizableViewController();
		parameterizableViewController.setViewName("dashboard");
		return parameterizableViewController;
	}

	@Bean
	public ViewResolver jspViewResolver() {
		InternalResourceViewResolver viewResolver = null;

		viewResolver = new InternalResourceViewResolver("/WEB-INF/jsp/", ".jsp");
		return viewResolver;
	}
}
