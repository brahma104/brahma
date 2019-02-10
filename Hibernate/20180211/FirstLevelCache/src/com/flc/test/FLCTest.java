package com.flc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.flc.entities.Product;
import com.flc.helper.SessionFactoryRegistry;

public class FLCTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		Product product = null;
		boolean flag = false;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			/*
			 * transaction = session.beginTransaction();
			 * 
			 * product = new Product(); product.setProductName("Television");
			 * product.setDescription("Led Tv"); product.setPrice(3939.34f);
			 * session.save(product);
			 */

			product = session.get(Product.class, 1);
			//session.evict(product);
			session.clear();
			Product product1 = session.get(Product.class, 1);
			System.out.println("product1 == product2 ? : " + (product == product1));

			flag = true;

		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			if (session != null) {
				session.close();
			}
			SessionFactoryRegistry.closeSessionFactory();
		}
	}
}
