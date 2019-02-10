package com.cs.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cs.entities.Loan;
import com.cs.helper.SessionFactoryRegistry;

public class CSTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			Loan loan = (Loan) session.get(Loan.class, 1);
			System.out.println(loan);
		}finally {
			if(session != null) {
				session.close();
			}
			SessionFactoryRegistry.closeSessionFactory();
		}
	}
}
