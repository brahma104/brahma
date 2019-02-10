package com.tpch.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tpch.entities.AccidentalPlan;
import com.tpch.entities.MedicalPlan;
import com.tpch.helper.SessionFactoryRegistry;
import com.tpch.entities.InsurancePlan;

public class TPCHTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		InsurancePlan insurancePlan = null;
		AccidentalPlan accidentalPlan = null;
		MedicalPlan medicalPlan = null;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			/*insurancePlan = new InsurancePlan();
			insurancePlan.setPlanName("Basic Plan");
			insurancePlan.setMinTenure(10);
			insurancePlan.setMaxAge(55);
			session.save(insurancePlan);

			accidentalPlan = new AccidentalPlan();
			accidentalPlan.setPlanName("Accidental Basic Plan");
			accidentalPlan.setMinTenure(20);
			accidentalPlan.setMaxAge(70);
			accidentalPlan.setDisabilityCoverage(true);
			accidentalPlan.setInternationalCoverage(true);
			accidentalPlan.setThirdPartyCoverage(false);
			session.save(accidentalPlan);

			medicalPlan = new MedicalPlan();
			medicalPlan.setPlanName("Basic Medical Plan");
			medicalPlan.setMinTenure(30);
			medicalPlan.setMaxAge(65);
			medicalPlan.setCopay(10);
			medicalPlan.setCoverageType("In-Patient");
			medicalPlan.setNetworkType("In-Network");
			session.save(medicalPlan);*/
			
			insurancePlan = (InsurancePlan) session.get(InsurancePlan.class, 2);
			System.out.println(insurancePlan);
			
			/*accidentalPlan = (AccidentalPlan) session.get(AccidentalPlan.class, 2);
			System.out.println(accidentalPlan);*/
			
			/*medicalPlan = (MedicalPlan) session.get(MedicalPlan.class, 2);
			System.out.println(medicalPlan);*/
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




