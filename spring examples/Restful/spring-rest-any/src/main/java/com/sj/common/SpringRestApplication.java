package com.sj.common;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

@ApplicationPath("/api")
public class SpringRestApplication extends Application {
	private Set<Object> singletons;

	public SpringRestApplication(@Context ServletContext servletContext) {
		List<String> resources = null;
		ApplicationContext context = null;

		resources = (List<String>) servletContext.getAttribute("resources");
		singletons = new HashSet<>();

		context = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
		for (String beanName : resources) {
			singletons.add(context.getBean(beanName));
		}
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
