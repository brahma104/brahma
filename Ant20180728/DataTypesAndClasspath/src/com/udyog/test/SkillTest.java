package com.udyog.test;

import com.udyog.dao.SkillDao;

public class SkillTest {
	public static void main(String[] args) throws Exception {
		SkillDao skillDao = new SkillDao();
		skillDao.showSkills();
		
		/*Properties props = System.getProperties();
		for(Object prop : props.keySet()) {
			System.out.println("prop : " + prop + " val : " +props.getProperty((String) prop));
		}*/
	}
}
