package com.jcadi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class MvcConfig {

	@Bean("/info.htm")
	public Controller info() {
		ParameterizableViewController parameterizableViewController = null;

		parameterizableViewController = new ParameterizableViewController();
		parameterizableViewController.setViewName("info");
		return parameterizableViewController;
	}

	@Bean
	public ViewResolver jspViewResolver() {
		InternalResourceViewResolver viewResolver = null;

		viewResolver = new InternalResourceViewResolver("/WEB-INF/jsp/", ".jsp");
		return viewResolver;
	}

}
