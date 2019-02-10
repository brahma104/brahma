package com.slc.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.stat.Statistics;

import com.slc.entities.Block;
import com.slc.entities.Flat;
import com.slc.helper.SessionFactoryRegistry;

public class SLCTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Block block = null;

		sessionFactory = SessionFactoryRegistry.getSessionFactory();
		Statistics stats = sessionFactory.getStatistics();

		/*
		  try { 
                   session = sessionFactory.openSession(); 
                   block = (Block)session.get(Block.class, 1); 
                   System.out.println("Block Name : " +block.getBlockName()); 
                   Flat flat =block.getFlats().iterator().next(); 
                   System.out.println("Floor : "+flat.getFloor()); 
                   } finally { 
                     if (session != null) {
		        session.close(); 
                    }
                   } 
                   System.out.println("slc hit : "+stats.getSecondLevelCacheHitCount());
		  
		  try {
                      session = sessionFactory.openSession(); 
                      block = (Block)session.get(Block.class, 1); 
                      System.out.println("Block Name : " +block.getBlockName()); 
                      Flat flat =block.getFlats().iterator().next(); 
                      System.out.println("Floor : "+flat.getFloor()); 
                    } finally { 
                        if (session != null) {
		           session.close(); 
                    } 
                  }
		 */
		try {
			session = sessionFactory.openSession();
			Query query = session.createQuery("from Block b where b.units >= ?");
			query.setInteger(0, 150);
			query.setCacheable(true);
			List<Block> blocks = query.list();
			System.out.println(
					"Block Name : " + blocks.get(0).getBlockName() + " hashCode : " + blocks.get(0).hashCode());
		} finally {
			if (session != null) {
				session.close();
			}
		}
		
		try {
			session = sessionFactory.openSession();
			Query query = session.createQuery("from Block b where b.units >= ?");
			query.setInteger(0, 150);
			query.setCacheable(true);
			List<Block> blocks = query.list();
			System.out.println(
					"Block Name : " + blocks.get(0).getBlockName() + " hashCode : " + blocks.get(0).hashCode());
		} finally {
			if (session != null) {
				session.close();
			}
		}

		System.out.println("slc hit : " + stats.getSecondLevelCacheHitCount());
		System.out.println("query hit : " +stats.getQueryCacheHitCount());
		

		SessionFactoryRegistry.closeSessionFactory();

	}
}









