package com.gvl.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gvl.entities.Appointment;
import com.gvl.entities.IAppointment;
import com.gvl.helper.SessionFactoryRegistry;

public class GVLTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		IAppointment appointment = null;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();

			appointment = session.load(Appointment.class, 1);
			/*if(appointment != null) {
				System.out.println("not null");
				System.out.println("appointmentNo : " + appointment.getAppointmentNo());
			}*/
			System.out.println("load completed");
			System.out.println("Entity Class : " + appointment.getClass().getName());
			System.out.println(appointment.getPatientName());

		} finally {
			if (session != null) {
				session.close();
			}
			SessionFactoryRegistry.closeSessionFactory();
		}

	}
}
