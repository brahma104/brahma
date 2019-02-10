package com.qa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.qa.bo.CompanyBo;
import com.qa.bo.JobDetailsBo;
import com.qa.bo.SkillBo;

public class JobDao {
	private final String SQL_GET_JOB_DETAILS_BY_LOCATION = "select j.*,c.*,s.* from jobs j inner join job_skills js on j.jobNo = js.job_no inner join skill s on s.skill_no = js.skill_no inner join company c on c.company_no = j.company_no where j.location like ?";
	private JdbcTemplate jdbcTemplate;

	public JobDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<JobDetailsBo> getJobsByLocation(String location) {
		return jdbcTemplate.query(SQL_GET_JOB_DETAILS_BY_LOCATION, new JobDetailsResultSetExtractor(), location);
	}

	private final class JobDetailsResultSetExtractor implements ResultSetExtractor<List<JobDetailsBo>> {
		@Override
		public List<JobDetailsBo> extractData(ResultSet rs) throws SQLException, DataAccessException {
			Map<Integer, JobDetailsBo> jobDetailsMap = null;
			List<SkillBo> skills = null;
			CompanyBo cBo = null;
			JobDetailsBo jBo = null;
			SkillBo sBo = null;
			int jobNo = 0;
			List<JobDetailsBo> jobDetails = null;

			jobDetailsMap = new HashMap<>();
			while (rs.next()) {
				jobNo = rs.getInt("j.jobNo");
				if (jobDetailsMap.containsKey(jobNo) == false) {
					jBo = new JobDetailsBo();
					jBo.setJobNo(jobNo);
					jBo.setTitle(rs.getString("j.title"));
					jBo.setDescription(rs.getString("j.description"));
					jBo.setOfferedSalary(rs.getDouble("j.offered_salary"));
					jBo.setLocation(rs.getString("j.location"));

					cBo = new CompanyBo();
					cBo.setCompanyNo(rs.getInt("c.company_no"));
					cBo.setCompanyName(rs.getString("c.company_nm"));
					cBo.setDescription(rs.getString("c.description"));
					cBo.setEstablishedDate(rs.getDate("c.established_dt"));
					cBo.setLocation(rs.getString("c.location"));
					jBo.setCompany(cBo);

					sBo = new SkillBo();
					sBo.setSkillNo(rs.getInt("s.skill_no"));
					sBo.setSkillName(rs.getString("s.skill_nm"));
					sBo.setTechnology(rs.getString("s.technology"));
					skills = new ArrayList<SkillBo>();
					skills.add(sBo);
					jBo.setSkills(skills);
					jobDetailsMap.put(jobNo, jBo);
				} else {
					sBo = new SkillBo();
					sBo.setSkillNo(rs.getInt("s.skill_no"));
					sBo.setSkillName(rs.getString("s.skill_nm"));
					sBo.setTechnology(rs.getString("s.technology"));
					jBo = jobDetailsMap.get(jobNo);
					jBo.getSkills().add(sBo);
				}
			}
			jobDetails = new ArrayList<>();
			for (JobDetailsBo bo : jobDetailsMap.values()) {
				jobDetails.add(bo);
			}
			return jobDetails;
		}

	}

}
