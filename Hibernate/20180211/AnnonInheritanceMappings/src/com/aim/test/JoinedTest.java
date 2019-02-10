package com.aim.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.aim.helper.SessionFactoryRegistry;
import com.aim.joined.entities.NonTechnicalStaff;
import com.aim.joined.entities.Staff;
import com.aim.joined.entities.TechnicalStaff;
import com.aim.single.entities.FixedBidProject;
import com.aim.single.entities.Project;
import com.aim.single.entities.TimeTrackingProject;

public class JoinedTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Staff staff = null;
		TechnicalStaff tStaff = null;
		NonTechnicalStaff ntStaff = null;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			staff = new Staff();
			staff.setFullName("Samba");
			staff.setMobile("939484");
			staff.setEmailAddress("samba@gmail.com");
			session.save(staff);
			
			tStaff = new TechnicalStaff();
			tStaff.setFullName("Siva");
			tStaff.setMobile("984739");
			tStaff.setEmailAddress("siva@gmail.com");
			tStaff.setPrimarySkill("Java");
			tStaff.setHighestQualification("Btech");
			session.save(tStaff);
			
			ntStaff = new NonTechnicalStaff();
			ntStaff.setFullName("Sunil");
			ntStaff.setMobile("949382");
			ntStaff.setEmailAddress("sunil@gmail.com");
			ntStaff.setWorkType("Administration");
			ntStaff.setHoursPerWeek(40);
			session.save(ntStaff);
			
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
