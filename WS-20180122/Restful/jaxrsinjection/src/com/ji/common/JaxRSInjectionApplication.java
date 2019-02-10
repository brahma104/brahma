package com.ji.common;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.ji.it.resources.PostalService;

@ApplicationPath("/api")
public class JaxRSInjectionApplication extends Application {
	private Set<Object> singletons;

	public JaxRSInjectionApplication() {
		//singletons = new HashSet<>();
		//singletons.add(new PostalService());
	}

	/*@Override
	public Set<Object> getSingletons() {
		return singletons;
	}*/

}
