package com.jb.common;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.jb.resources.Netbanking;

/*@ApplicationPath("/api")*/
public class HdfcApplication extends Application {
	private Set<Object> singletons;
	private Set<Class<?>> classes;

	public HdfcApplication() {
		System.out.println("hdfcApplication()");
		singletons = new HashSet<>();
		classes = new HashSet<>();

		singletons.add(new Netbanking());
	}

	@Override
	public Set<Class<?>> getClasses() {
		System.out.println("getClasses()");
		return classes;
	}

	@Override
	public Set<Object> getSingletons() {
		System.out.println("getSingletons()");
		return singletons;
	}

}
