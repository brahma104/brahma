package com.nextgen.common;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

import com.nextgen.resources.TrainAvailabilityService;

public class NextGenApplication extends Application {
	private Set<Class<?>> classes;

	public NextGenApplication() {
		classes = new HashSet<>();
		classes.add(TrainAvailabilityService.class);
		classes.add(RolesAllowedDynamicFeature.class);
	}

	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}

}
