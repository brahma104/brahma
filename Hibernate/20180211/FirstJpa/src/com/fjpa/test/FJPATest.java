package com.fjpa.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.fjpa.entities.Project;

public class FJPATest {
	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction transaction = null;
		boolean flag = false;

		try {
			emf = Persistence.createEntityManagerFactory("project-management");
			em = emf.createEntityManager();
			transaction = em.getTransaction();
			transaction.begin();
			Project project = new Project();
			project.setProjectName("Project Tracking System");
			project.setDescription("Project Management and Tracking");
			project.setDuration(6);
			project.setDomain("operations");
			project.setClientName("in-house");
			project.setProjectStartDate(new Date());

			em.persist(project);
			System.out.println("stored project");
			flag = true;

		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}

	}
}
