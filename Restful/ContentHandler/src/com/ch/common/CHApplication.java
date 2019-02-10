package com.ch.common;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.ch.resources.WayBillService;

public class CHApplication extends Application {
	private Set<Object> singletons;
	private Set<Class<?>> classes;

	public CHApplication() {
		singletons = new HashSet<>();
		classes = new HashSet<>();

		singletons.add(new WayBillService());
	}

	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
