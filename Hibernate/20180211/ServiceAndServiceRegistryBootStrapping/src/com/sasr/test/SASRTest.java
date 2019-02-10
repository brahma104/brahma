package com.sasr.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sasr.entities.Account;
import com.sasr.helper.SessionFactory5Registry;
import com.sasr.helper.SessionFactoryRegistry;

public class SASRTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;

		try {
			sessionFactory = SessionFactory5Registry.getSessionFactory();
			session = sessionFactory.openSession();
			Account account = (Account) session.get(Account.class, 1);
			System.out.println(account);
		} finally {
			if (session != null) {
				session.close();
			}
			SessionFactoryRegistry.closeSessionFactory();
		}
	}
}
