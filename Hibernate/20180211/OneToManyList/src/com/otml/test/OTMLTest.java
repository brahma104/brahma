package com.otml.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otml.entities.Society;
import com.otml.entities.Staff;
import com.otml.helper.SessionFactoryRegistry;

public class OTMLTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Staff staff = null;
		Society society = null;
		List<Staff> lstaff = null;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			/*lstaff = new ArrayList<>();
			staff = new Staff();
			staff.setStaffName("David");
			staff.setAge(28);
			staff.setGender("Male");
			staff.setMobile("3948404");
			staff.setEmailAddress("david@gmail.com");
			session.save(staff);
			lstaff.add(staff);

			staff = new Staff();
			staff.setStaffName("Paul");
			staff.setAge(30);
			staff.setGender("Male");
			staff.setMobile("393940");
			staff.setEmailAddress("paul@gmail.com");
			session.save(staff);
			lstaff.add(staff);

			society = new Society();
			society.setSocietyName("Aparna Cyberperl");
			society.setSocietyRegisteredName("Aparna Cyber");
			society.setRegisteredDate(new Date());
			society.setMobile("3934040");
			society.setEmailAddress("aparna@gmail.com");
			society.setStaff(lstaff);
			session.save(society);*/
			
			society = session.get(Society.class, 1);
			System.out.println(society);

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
