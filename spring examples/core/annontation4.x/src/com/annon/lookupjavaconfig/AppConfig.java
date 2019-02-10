package com.annon.lookupjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.annon.lookupjavaconfig")
public class AppConfig {
	@Autowired
	private ApplicationContext context;

	@Bean
	public Container container() {
		return new Container() {
			@Override
			public RequestHandler lookupRequestHandler() {
				return context.getBean("requestHandler", RequestHandler.class);
			}
		};
	}

}




