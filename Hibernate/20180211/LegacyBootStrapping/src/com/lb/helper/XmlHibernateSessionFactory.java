package com.lb.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class XmlHibernateSessionFactory {
	private static SessionFactory sessionFactory;

	static {
		Configuration configuration = new Configuration().configure("com/lb/common/organizer.cfg.xml");
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
