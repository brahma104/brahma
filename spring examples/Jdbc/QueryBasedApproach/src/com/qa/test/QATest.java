package com.qa.test;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qa.bo.CompanyBo;
import com.qa.bo.JobDetailsBo;
import com.qa.dao.CompanyDao;
import com.qa.dao.JobDao;
import com.qa.dao.SkillDao;

public class QATest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/qa/common/application-context.xml");
		CompanyDao companyDao = context.getBean("companyDao", CompanyDao.class);
		
		List<CompanyBo> companies = companyDao.getAllCompaniesByPagination(3, 5);
		for(CompanyBo bo : companies) {
			System.out.println(bo);
		}
		// System.out.println("No of Companies : " + companyDao.findNoOfCompanies());
		// System.out.println("Name : " +companyDao.findCompanyNameByNo(2));
		// System.out.println(companyDao.findCompanyByNo(2));
		// System.out.println(companyDao.findCompaniesByName("Services"));
		/*
		 * CompanyBo bo = new CompanyBo(); bo.setCompanyNo(3);
		 * bo.setCompanyName("Wipro Technologies");
		 * bo.setDescription("Software Services"); bo.setEstablishedDate(new Date());
		 * bo.setLocation("Chennai"); int inserted = companyDao.insertCompany(bo);
		 * System.out.println("inserted : "+ inserted);
		 * System.out.println(companyDao.getCompanyNameAndLocation());
		 */

		/*
		 * SkillDao skillDao = context.getBean("skillDao", SkillDao.class); int skillNo
		 * = skillDao.insertSkillAndGetSkillNo("c#", ".net");
		 * System.out.println("skillNo : " + skillNo);
		 */

		/*JobDao jobDao = context.getBean("jobDao", JobDao.class);
		List<JobDetailsBo> jobs = jobDao.getJobsByLocation("Hyderabad");
		for (JobDetailsBo bo : jobs) {
			System.out.println(bo);
		}*/
	}

}














