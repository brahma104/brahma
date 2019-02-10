package com.msosc.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.msosc.bo.SkillBo;
import com.msosc.config.PersistenceConfig;
import com.msosc.dao.SkillDao;

public class MSOSCTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PersistenceConfig.class);
		SkillDao skillDao = context.getBean("skillDao", SkillDao.class);
		int c = skillDao.updateSkillNameBySkillNo(1, "Core Java");
		System.out.println("updated : " +c);
		List<SkillBo> skills = skillDao.getSkillsByTechnology("java");
		
		for(SkillBo bo : skills) {
			System.out.println(bo);
		}
	}
}


















