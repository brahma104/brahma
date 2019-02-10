package com.lb.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PropsHibernateSessionFactory {
	private static SessionFactory sessionFactory;

	static {
		Configuration configuration = new Configuration();
		configuration.addResource("com/lb/entities/Event.hbm.xml");
		sessionFactory = configuration.buildSessionFactory();
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
