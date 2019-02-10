package com.ca.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ca.bo.CompanyBo;
import com.ca.bo.JobBo;
import com.ca.dao.CompanyDao;
import com.ca.dao.JobDao;

public class CATest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ca/common/application-context.xml");
		/*CompanyDao companyDao = context.getBean("companyDao", CompanyDao.class);
		//List<CompanyBo> bos = companyDao.findCompaniesByName("Services");
		List<CompanyBo> bos = companyDao.getAllCompanies();
		for (CompanyBo bo : bos) {
			System.out.println(bo);
		}*/
		
		JobBo job = new JobBo();
		job.setJobNo(1);
		job.setTitle("Java Developer");
		job.setDescription("Java Software Developer");;
		job.setExperience(3);
		job.setLocation("Hyderabad");
		job.setOfferedSalary(2);
		job.setCompanyNo(1);
		job.setSkills(new int[] {1, 3, 5});
		
		JobDao jobDao = context.getBean("jobDao", JobDao.class);
		int upd = jobDao.updateJob(job);
		System.out.println("updated : " +upd);
	}
}






























