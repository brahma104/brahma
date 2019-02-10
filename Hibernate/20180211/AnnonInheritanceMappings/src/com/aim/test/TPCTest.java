package com.aim.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.aim.helper.SessionFactoryRegistry;
import com.aim.single.entities.FixedBidProject;
import com.aim.single.entities.Project;
import com.aim.single.entities.TimeTrackingProject;
import com.aim.tpc.entities.DomesticHoliday;
import com.aim.tpc.entities.InternationalHoliday;

public class TPCTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		DomesticHoliday dHoliday = null;
		InternationalHoliday iHoliday = null;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			dHoliday = new DomesticHoliday();
			dHoliday.setPackageName("Goa Trip");
			dHoliday.setDuration(5);
			dHoliday.setAmount(34949);
			dHoliday.setFoodIncluded(true);
			dHoliday.setTravelType("Flight");
			session.save(dHoliday);
			
			iHoliday = new InternationalHoliday();
			iHoliday.setPackageName("Srilanka");
			iHoliday.setDuration(15);
			iHoliday.setAmount(134949);
			iHoliday.setPassportRequired(true);
			iHoliday.setVisaRequired(true);
			session.save(iHoliday);
			
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
