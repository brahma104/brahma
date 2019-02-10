package com.cs.service.intiator;

import java.util.Map;

import org.hibernate.boot.registry.StandardServiceInitiator;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.service.spi.ServiceRegistryImplementor;

import com.cs.service.JdbcConnectionProviderImpl;

public class JdbcConnectionProviderServiceInitiator implements StandardServiceInitiator<ConnectionProvider> {

	@Override
	public Class<ConnectionProvider> getServiceInitiated() {
		System.out.println("getServiceInitiated()");
		return ConnectionProvider.class;
	}

	@Override
	public JdbcConnectionProviderImpl initiateService(Map properties,
			ServiceRegistryImplementor serviceRegistryImplementor) {
		System.out.println("properties :" + properties);
		System.out.println("Registry : " + serviceRegistryImplementor.getClass().getName());
		
		JdbcConnectionProviderImpl cp = new JdbcConnectionProviderImpl();
		return cp;
	}

}







