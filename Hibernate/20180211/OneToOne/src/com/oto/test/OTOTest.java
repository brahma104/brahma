package com.oto.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.oto.entities.Admission;
import com.oto.entities.Scholarship;
import com.oto.helper.SessionFactoryRegistry;

public class OTOTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Admission admission = null;
		Scholarship scholarship = null;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			admission = new Admission();
			admission.setAdmissionDate(new Date());
			admission.setCandidateName("David");
			admission.setCollege("Nagarjuna");
			admission.setDateOfBirth(new Date());
			admission.setDegree("Bsc");
			admission.setGender("Male");
			session.save(admission);

			scholarship = new Scholarship();
			scholarship.setSanctionedDate(new Date());
			scholarship.setScholarshipType("Tution Fees");
			scholarship.setCategory("General Category");
			scholarship.setSanctionedAmount(34000);
			scholarship.setAdmission(admission);
			session.save(scholarship);
			
			/*scholarship = session.get(Scholarship.class, 1);
			System.out.println("Scholarship Type: "+ scholarship.getScholarshipType());*/

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
