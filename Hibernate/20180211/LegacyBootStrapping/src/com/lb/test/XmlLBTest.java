package com.lb.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.lb.entities.Event;
import com.lb.helper.XmlHibernateSessionFactory;

public class XmlLBTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Event event = null;

		try {
			sessionFactory = XmlHibernateSessionFactory.getSessionFactory();
			session = sessionFactory.openSession();
			event = (Event) session.get(Event.class, 1);
			System.out.println(event);
		} finally {
			if (session != null) {
				session.close();
			}
			XmlHibernateSessionFactory.closeSessionFactory();
		}
	}
}
