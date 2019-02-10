package com.tpsc.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tpsc.entities.CardPayment;
import com.tpsc.entities.ChequePayment;
import com.tpsc.entities.Payment;
import com.tpsc.helper.SessionFactoryRegistry;

public class TPSCTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Payment payment = null;
		CardPayment cardPayment = null;
		ChequePayment chequePayment = null;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			/*
			 * payment = new Payment(); payment.setPaymentDate(new Date());
			 * payment.setMerchantName("Big Bazar"); payment.setAmount(1000);
			 * session.save(payment);
			 * 
			 * cardPayment = new CardPayment(); cardPayment.setPaymentDate(new
			 * Date()); cardPayment.setMerchantName("Central");
			 * cardPayment.setAmount(2000); cardPayment.setCardNo(9876);
			 * cardPayment.setBankName("icici");
			 * cardPayment.setCardHolderName("Rahul");
			 * session.save(cardPayment);
			 * 
			 * chequePayment = new ChequePayment();
			 * chequePayment.setPaymentDate(new Date());
			 * chequePayment.setMerchantName("shopper stop");
			 * chequePayment.setAmount(5000);
			 * chequePayment.setChequeIssuedDate(new Date());
			 * chequePayment.setChequeNo(4567);
			 * chequePayment.setChequeIssuedName("Rakesh");
			 * session.save(chequePayment);
			 */

			/*
			 * cardPayment = session.get(CardPayment.class, 3);
			 * System.out.println(cardPayment);
			 */

			payment = session.get(Payment.class, 2);
			System.out.println(payment);
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
