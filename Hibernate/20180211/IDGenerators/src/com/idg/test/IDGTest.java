package com.idg.test;

import org.hibernate.Transaction;

import com.idg.entities.ServiceRequest;
import com.idg.helper.SessionFactoryRegistry;

import java.util.Date;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

public class IDGTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		ServiceRequest serviceRequest = null;
		boolean flag = false;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			serviceRequest = new ServiceRequest();
			// serviceRequest.setServiceRequestNo(2);
			serviceRequest.setUniqueProductCode("OP5T9383");
			serviceRequest.setDescription("One Plus 5T Mobile with Warranty");
			serviceRequest.setProblem("Mobile is not switched on");
			serviceRequest.setEstimatedDeliveryDate(new Date());
			serviceRequest.setEstimatedAmount(0);
			serviceRequest.setStatus("open");
			int serviceRequestNo = (Integer) session.save(serviceRequest);
			System.out.println("serviceRequestNo : " + serviceRequestNo);
			
			/*
			 * transaction.commit(); session.close();
			 */

			/*
			 * session = sessionFactory.openSession(); transaction =
			 * session.beginTransaction(); serviceRequest = new
			 * ServiceRequest(); // serviceRequest.setServiceRequestNo(2);
			 * serviceRequest.setUniqueProductCode("OP5T933i3");
			 * serviceRequest.setDescription("IPhone X Mobile with Warranty");
			 * serviceRequest.setProblem("Mobile is not Charging on");
			 * serviceRequest.setEstimatedDeliveryDate(new Date());
			 * serviceRequest.setEstimatedAmount(10393);
			 * serviceRequest.setStatus("open"); session.save(serviceRequest);
			 */
			flag = true;
		} finally {
			if (transaction != null) {
				if (flag == true) {
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
