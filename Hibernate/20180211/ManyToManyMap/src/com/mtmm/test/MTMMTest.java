package com.mtmm.test;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtmm.entities.Member;
import com.mtmm.entities.Responsibility;
import com.mtmm.helper.SessionFactoryRegistry;

public class MTMMTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Responsibility responsibility1 = null;
		Responsibility responsibility2 = null;
		Responsibility responsibility3 = null;
		Member member = null;
		Map<String, Responsibility> memberResponsibilities = null;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			responsibility1 = new Responsibility();
			responsibility1.setDescription("Maintainance Finance");
			responsibility1.setResponsibilityType("Finance");
			session.save(responsibility1);
			
			responsibility2 = new Responsibility();
			responsibility2.setDescription("Cultural Committe");
			responsibility2.setResponsibilityType("Festival");
			session.save(responsibility2);
			
			responsibility3 = new Responsibility();
			responsibility3.setDescription("Cleanliness and Gardening");
			responsibility3.setResponsibilityType("Regular");
			session.save(responsibility3);
			
			member = new Member();
			member.setMemberName("Susan");
			member.setMobile("3948596");
			member.setEmailAddress("susan@gmail.com");
			memberResponsibilities = new HashMap<>();
			memberResponsibilities.put("Finance Director", responsibility1);
			memberResponsibilities.put("Chief Operations", responsibility2);
			member.setResponsibilities(memberResponsibilities);
			session.save(member);

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
