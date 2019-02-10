package com.aim.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.aim.helper.SessionFactoryRegistry;
import com.aim.single.entities.FixedBidProject;
import com.aim.single.entities.Project;
import com.aim.single.entities.TimeTrackingProject;

public class SingleTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Project project = null;
		FixedBidProject fbProject = null;
		TimeTrackingProject ttProject = null;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			project = new Project();
			project.setProjectName("Road Works");
			project.setContractor("L&T");
			project.setWorkType("civil");
			session.save(project);

			fbProject = new FixedBidProject();
			fbProject.setProjectName("Electrical Work");
			fbProject.setContractor("BE Electronics");
			fbProject.setWorkType("electrical");
			fbProject.setDuration(30);
			fbProject.setBidAmount(203030);
			session.save(fbProject);

			ttProject = new TimeTrackingProject();
			ttProject.setProjectName("Drianage Repair");
			ttProject.setContractor("L&T");
			ttProject.setWorkType("civil");
			ttProject.setHours(40);
			ttProject.setHourlyRate(1000);
			session.save(ttProject);

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
