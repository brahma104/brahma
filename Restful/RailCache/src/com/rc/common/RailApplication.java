package com.rc.common;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.rc.resources.RailService;

@ApplicationPath("/api")
public class RailApplication extends Application {
	private Set<Object> singletons;

	public RailApplication() {
		singletons = new HashSet<>();
		singletons.add(new RailService());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
