package com.msf.accessor;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.msf.entities.Owner;
import com.msf.helper.HibernateSessionFactory;

public class OwnerAccessor {
	public Owner getOwner(int ownerNo) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Owner owner = null;

		sessionFactory = HibernateSessionFactory.getSessionFactory();
		session = sessionFactory.openSession();
		owner = (Owner) session.get(Owner.class, ownerNo);
		session.close();
		return owner;
	}

	public int saveOwner(Owner owner) {
		int ownerNo = 0;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		try {
			sessionFactory = HibernateSessionFactory.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			ownerNo = (Integer) session.save(owner);
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
		}
		return ownerNo;
	}
}
