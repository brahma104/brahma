package com.lb.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.lb.entities.Event;
import com.lb.helper.ProgHibernateSessionFactory;

public class ProgLBTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Event event = null;

		try {
			sessionFactory = ProgHibernateSessionFactory.getSessionFactory();
			session = sessionFactory.openSession();
			event = (Event) session.get(Event.class, 1);
			System.out.println(event);
		} finally {
			if (session != null) {
				session.close();
			}
			ProgHibernateSessionFactory.closeSessionFactory();
		}
	}

}
