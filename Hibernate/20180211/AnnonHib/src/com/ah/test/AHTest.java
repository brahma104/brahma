package com.ah.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ah.entities.Product;
import com.ah.helper.SessionFactoryRegistry;

public class AHTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		Product product = null;
		boolean flag = false;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			product = new Product();
			product.setProductName("Mobile");
			product.setCategory("Electronics");
			product.setDescription("Smart Mobile");
			product.setManufacturedDate(new Date());
			product.setPrice(39484.34f);

			int productNo = (Integer) session.save(product);
			System.out.println("product : " + productNo);
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
