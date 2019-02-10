package com.co.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.co.entities.Bus;
import com.co.entities.Trip;
import com.co.helper.SessionFactoryRegistry;

public class COTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Trip trip = null;
		Bus bus = null;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			Query<Trip> query = session.createQuery("from Trip");
			List<Trip> trips = query.list();
			for(Trip t : trips) {
				System.out.println(t);
			}
			
			
			
			// insertBus(session);
			/*bus = session.get(Bus.class, 1);
			session.delete(bus);*/
			
			/*bus = session.get(Bus.class, 1);
			Iterator<Trip> it = bus.getTrips().iterator();
			while(it.hasNext()) {
				it.next();
				it.remove();
			}
			session.update(bus);*/
			
			/*bus = session.get(Bus.class, 1);
			System.out.println("bus Type : " + bus.getBusType());
			
			Set<Trip> trips = bus.getTrips();
			for(Trip t: trips) {
				System.out.println(t);
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
	
	private static void  insertBus(Session session) {
		Bus bus = null;
		Trip trip = null;
		Set<Trip> trips = null;
		
		bus = new Bus();
		bus.setBusType("Semi sleeper");
		
		trips = new HashSet<>();
		trip = new Trip();
		trip.setSource("Hyderabad");
		trip.setDestination("Banglore");
		trip.setJourneyDate(new Date());
		trip.setBus(bus);
		trips.add(trip);
		
		trip = new Trip();
		trip.setSource("Hyderabad");
		trip.setDestination("Chennai");
		trip.setJourneyDate(new Date());
		trip.setBus(bus);
		trips.add(trip);
		
		
		bus.setTrips(trips);
		session.save(bus);
	}

}






