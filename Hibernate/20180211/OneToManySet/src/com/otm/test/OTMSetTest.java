package com.otm.test;

import org.hibernate.Transaction;

import com.otm.entities.Block;

import com.otm.entities.Flat;
import com.otm.helper.SessionFactoryRegistry;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

public class OTMSetTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Flat flat = null;
		Block block = null;
		Set<Flat> flats = null;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			flats = new HashSet<>();
			flat = new Flat();
			flat.setDescription("2BHK with Semi Furnished");
			flat.setFlatType("2 BHK");
			flat.setFacing("East");
			flat.setFloor(2);
			flat.setSqft(1250);
			flat.setStatus("A");
			session.save(flat);
			flats.add(flat);

			flat = new Flat();
			flat.setDescription("2BHK with Fully Furnished");
			flat.setFlatType("2 BHK");
			flat.setFacing("East");
			flat.setFloor(12);
			flat.setSqft(1250);
			flat.setStatus("A");
			session.save(flat);
			flats.add(flat);

			flat = new Flat();
			flat.setDescription("3BHK with Semi Furnished");
			flat.setFlatType("3 BHK");
			flat.setFacing("West");
			flat.setFloor(21);
			flat.setSqft(1750);
			flat.setStatus("A");
			session.save(flat);
			flats.add(flat);

			block = new Block();
			block.setBlockName("Marine");
			block.setDescription("Corner Block");
			block.setUnits(400);
			block.setFlats(flats);
			session.save(block);
			
			/*block = session.get(Block.class, 1);
			System.out.println("Block Name :" + block.getBlockName());
			for(Flat f : block.getFlats()) {
				System.out.println(f);
			}*/

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
