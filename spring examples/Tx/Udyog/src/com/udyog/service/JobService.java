package com.udyog.service;

import org.springframework.transaction.annotation.Transactional;

import com.udyog.bo.CompanyBo;
import com.udyog.bo.JobBo;
import com.udyog.dao.CompanyDao;
import com.udyog.dao.JobDao;

public class JobService {
	private CompanyDao companyDao;
	private JobDao jobDao;

	@Transactional(readOnly = false)
	public int postJob(CompanyBo companyBo, JobBo jobBo) {
		int companyNo = 0;

		companyNo = companyDao.saveCompany(companyBo);
		jobBo.setCompanyNo(companyNo + 1);
		return jobDao.saveJob(jobBo);
	}

	public void setCompanyDao(CompanyDao companyDao) {
		this.companyDao = companyDao;
	}

	public void setJobDao(JobDao jobDao) {
		this.jobDao = jobDao;
	}

}
