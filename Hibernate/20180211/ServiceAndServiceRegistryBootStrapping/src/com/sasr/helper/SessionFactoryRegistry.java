package com.sasr.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.BootstrapServiceRegistry;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistry {
	private static SessionFactory sessionFactory;

	static {
		Configuration configuration = new Configuration().configure();
		BootstrapServiceRegistryBuilder bootstrapServiceRegistryBuilder = new BootstrapServiceRegistryBuilder();
		BootstrapServiceRegistry bootstrapServiceRegistry = bootstrapServiceRegistryBuilder.build();

		StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder(
				bootstrapServiceRegistry);
		standardServiceRegistryBuilder.applySettings(configuration.getProperties());
		StandardServiceRegistry standardServiceRegistry = standardServiceRegistryBuilder.build();
		sessionFactory = configuration.buildSessionFactory(standardServiceRegistry);
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
