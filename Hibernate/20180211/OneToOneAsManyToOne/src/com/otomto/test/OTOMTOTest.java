package com.otomto.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otomto.entities.Flat;
import com.otomto.entities.Resident;
import com.otomto.helper.SessionFactoryRegistry;

public class OTOMTOTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Flat flat = null;
		Resident resident = null;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			/*flat = new Flat();
			flat.setFlatType("2 BHK");
			flat.setDescription("Double bed room flat");
			flat.setFacing("East");
			flat.setSqft(1240);
			flat.setStatus("available");
			session.save(flat);

			resident = new Resident();
			resident.setResidentFirstName("Mathew");
			resident.setResidentLastName("L");
			resident.setMobile("0394048");
			resident.setEmailAddress("mathew@gmail.com");
			resident.setFlat(flat);

			session.save(resident);*/
			
			resident = session.get(Resident.class, 1);
			System.out.println(resident.getEmailAddress());
			//System.out.println(resident.getFlat().getFacing());

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
