package com.apnacomplex.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.apnacomplex.entities.Society;

public class FHTest {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Society society = (Society) session.get(Society.class, 1000);
		System.out.println(society);
		session.close();
		sessionFactory.close();
	}
}
