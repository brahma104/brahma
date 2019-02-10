package com.npjdbc.test;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.npjdbc.bo.CompanyBo;
import com.npjdbc.config.PersistenceConfig;
import com.npjdbc.dao.CompanyDao;

public class NPJdbcTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PersistenceConfig.class);
		CompanyDao companyDao = context.getBean("companyDao", CompanyDao.class);
		/*int count = companyDao.findNoOfCompaniesByLocation("Hyderabad");
		System.out.println("count : "+ count);*/
		CompanyBo bo = new CompanyBo();
		bo.setCompanyNo(15);
		bo.setCompanyName("Polaris");
		bo.setDescription("Software IT Services");
		bo.setEstablishedDate(new Date());
		bo.setLocation("Hyderabad");
		companyDao.simpleInsertCompany(bo);
		
		List<CompanyBo> companies = companyDao.findCompaniesByNameAndLocation("Services", "Hyderabad");
		System.out.println(companies);
	}
}


















