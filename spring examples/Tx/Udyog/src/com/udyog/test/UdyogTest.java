package com.udyog.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.udyog.bo.CompanyBo;
import com.udyog.bo.JobBo;
import com.udyog.service.JobService;

public class UdyogTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/udyog/common/application-context.xml");
		CompanyBo company = new CompanyBo();
		company.setCompanyName("Tata Consultancy Services");
		company.setDescription("Software Services");
		company.setEstablishedDate(new Date());
		company.setLocation("Banglore");

		JobBo job = new JobBo();
		job.setTitle("Software Engineer");
		job.setDescription("Java Developer");
		job.setExperience(3);
		job.setLocation("Banglore");
		job.setOfferedSalary(93849);

		JobService jobService = applicationContext.getBean("jobService", JobService.class);
		int jobNo = jobService.postJob(company, job);
		System.out.println("posted job : " + jobNo);

	}
}
