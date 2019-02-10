package com.dmlop.test;

import javax.print.Doc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dmlop.entities.Doctor;
import com.dmlop.helper.SessionFactoryRegistry;

public class DMLOpTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Doctor doctor = null;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			/*doctor = new Doctor();
			doctor.setDoctorName("Mehata");
			doctor.setExperience(6);
			doctor.setQualification("MD");
			doctor.setSpecialization("Nuero Surgeon");
			int doctorNo = (Integer) session.save(doctor);
			System.out.println("ret doctor no :" + doctorNo);
			System.out.println("entity doctor no : " + doctor.getDoctorNo());
			
			doctor = new Doctor();
			doctor.setDoctorName("Mishra");
			doctor.setExperience(10);
			doctor.setQualification("DO");
			doctor.setSpecialization("Heart");
			session.persist(doctor);
			System.out.println("doctorNo : " +doctor.getDoctorNo());*/
			
			/*doctor = new Doctor();
			doctor.setDoctorName("Sharma");
			doctor.setExperience(16);
			doctor.setQualification("DGO");
			doctor.setSpecialization("Kidney");*/
			/*doctor = (Doctor) session.get(Doctor.class, 1);
			doctor.setExperience(20);
			session.saveOrUpdate(doctor);
			System.out.println("doctorNo : " + doctor.getDoctorNo());*/
			
			/*doctor = (Doctor) session.get(Doctor.class, 1);
			doctor.setExperience(31);
			session.update(doctor);*/
			
			
			//doctor = (Doctor) session.get(Doctor.class, 1);
			// one doctor object with id = 1 attached to the session
			
			// new doctor1 object with the same id = 1
			/*Doctor doctor1 = new Doctor();
			doctor1.setDoctorNo(doctor.getDoctorNo());
			doctor1.setDoctorName(doctor.getDoctorName());
			doctor1.setExperience(doctor.getExperience());
			doctor1.setQualification("DGO");
			doctor1.setSpecialization(doctor.getSpecialization());
			session.merge(doctor1);*/
			
			/*doctor = new Doctor();
			doctor.setDoctorNo(1);
			session.delete(doctor);*/
			/*doctor = (Doctor) session.load(Doctor.class, 2);
			doctor.setQualification("MD");
			*/
			doctor = (Doctor) session.get(Doctor.class, 2);
			session.close();
			// doctor will become detached
			
			doctor = new Doctor();
			doctor.setDoctorNo(3);
			
			
			
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
