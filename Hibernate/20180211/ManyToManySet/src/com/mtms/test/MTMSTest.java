package com.mtms.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtms.entities.Job;
import com.mtms.entities.Skill;
import com.mtms.helper.SessionFactoryRegistry;

public class MTMSTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Job job = null;
		Skill skill = null;
		Set<Skill> skills = null;

		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			/*skills = new HashSet<>();
			skill = new  Skill();
			skill.setSkillName("Java");
			skill.setTechnology("Java");
			session.save(skill);
			skills.add(skill);

			skill = new  Skill();
			skill.setSkillName("Servlet");
			skill.setTechnology("Jee");
			session.save(skill);
			skills.add(skill);
			
			skill = new  Skill();
			skill.setSkillName("Spring");
			skill.setTechnology("Java");
			session.save(skill);
			skills.add(skill);
			
			job = new Job();
			job.setTitle("Software Developer");
			job.setDescription("Java Development");
			job.setOfferedSalary(24643);
			job.setLocation("Hyderabad");
			job.setSkills(skills);
			session.save(job);*/
			
			job = session.get(Job.class, 28);
			session.delete(job);
			
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







