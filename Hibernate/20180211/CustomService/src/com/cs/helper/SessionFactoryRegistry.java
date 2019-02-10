package com.cs.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;

import com.cs.service.JdbcConnectionProviderImpl;
import com.cs.service.intiator.JdbcConnectionProviderServiceInitiator;

public class SessionFactoryRegistry {
	private static SessionFactory sessionFactory;

	static {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(configuration.getProperties());
		//builder.addService(ConnectionProvider.class, new JdbcConnectionProviderImpl());
		builder.addInitiator(new JdbcConnectionProviderServiceInitiator());
		StandardServiceRegistry registry = builder.build();
		sessionFactory = configuration.buildSessionFactory(registry);
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void closeSessionFactory() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}

}
