package com.otmm.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otmm.entities.Branch;
import com.otmm.entities.Cheque;
import com.otmm.helper.SessionFactoryRegistry;

public class OTMMTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Branch branch = null;
		Cheque cheque = null;
		Map<String, Cheque> clearingCheques = null;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			/*clearingCheques = new HashMap<>();
			cheque = new Cheque();
			cheque.setBorrowerName("James");
			cheque.setIssuedBy("Steve");
			cheque.setIssuedDate(new Date());
			cheque.setAmount(93849);
			cheque.setStatus("I");
			session.save(cheque);
			clearingCheques.put(UUID.randomUUID().toString(), cheque);
			
			cheque = new Cheque();
			cheque.setBorrowerName("David");
			cheque.setIssuedBy("Rock");
			cheque.setIssuedDate(new Date());
			cheque.setAmount(938);
			cheque.setStatus("I");
			session.save(cheque);
			clearingCheques.put(UUID.randomUUID().toString(), cheque);
			
			cheque = new Cheque();
			cheque.setStatus("P");
			session.save(cheque);
			
			branch = new Branch();
			branch.setBankName("Icicibank");
			branch.setBranchName("Ameerpet");
			branch.setIfscCode("if39340");
			branch.setLocation("Hyderabad");
			branch.setClearingCheques(clearingCheques);
			session.save(branch);*/
			branch = session.get(Branch.class, 1);
			System.out.println(branch);
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
