package com.pc.common;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.pc.converter.CustomParamConverterProvider;
import com.pc.resources.ProductService;

@ApplicationPath("/api")
public class PCApplication extends Application {
	private Set<Object> singletons;
	private Set<Class<?>> classes;

	public PCApplication() {
		singletons = new HashSet<>();
		classes = new HashSet<>();

		singletons.add(new CustomParamConverterProvider());
		classes.add(ProductService.class);
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
