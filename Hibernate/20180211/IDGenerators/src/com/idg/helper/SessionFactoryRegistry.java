package com.idg.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistry {
	private static SessionFactory sessionFactory;

	static {
		try {
			sessionFactory = new Configuration().configure("oracle-hibernate.cfg.xml").buildSessionFactory();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void closeSessionFactory() {
		if (sessionFactory != null) {
			sessionFactory.close();
			sessionFactory = null;
		}
	}

}
