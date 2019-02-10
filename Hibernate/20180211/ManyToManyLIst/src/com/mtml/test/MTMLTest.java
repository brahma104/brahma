package com.mtml.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtml.entities.Order;
import com.mtml.entities.Product;
import com.mtml.helper.SessionFactoryRegistry;

public class MTMLTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Order order = null;
		Product product = null;
		List<Product> products = null;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			/*products = new ArrayList<>();
			product = new Product();
			product.setProductName("Iphone X");
			product.setProductType("Electronics");
			product.setDescription("Smartphone");
			product.setPrice(98000);
			session.save(product);
			products.add(product);
			
			product = new Product();
			product.setProductName("Apple Smartwatch");
			product.setProductType("Electronics");
			product.setDescription("SmartWatch");
			product.setPrice(28000);
			session.save(product);
			products.add(product);
			
			order = new Order();
			order.setOrderedDate(new Date());
			order.setPaymentMethod("COD");
			order.setShippmentType("one-day");
			order.setAmount(120000);
			order.setStatus("Approved");
			order.setProducts(products);
			session.save(order);*/
			order = session.get(Order.class, 1);
			System.out.println(order);
			
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







