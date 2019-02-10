package com.jpagen.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jpagen.entities.Player;

public class JPAGenTest {
	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction transaction = null;
		Player player = null;
		boolean flag = false;

		try {
			emf = Persistence.createEntityManagerFactory("gamepu");
			em = emf.createEntityManager();
			transaction = em.getTransaction();
			transaction.begin();
			player = new Player();
			player.setPlayerName("Sachin");
			player.setEmailAddress("sachin@gmail.com");
			player.setExperience(33);
			player.setMobileNo("3938404");
			em.persist(player);
			System.out.println("player saved...");
			flag = true;
		} finally {
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
