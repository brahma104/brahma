package com.ca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ca.bo.JobBo;

public class JobDao {
	private final String SQL_UPD_JOB_BY_JOBNO = "update jobs set title = ?, description = ?, experience = ?, location = ?, offered_salary = ? where jobno = ? ";
	private final String SQL_DEL_JOB_SKILLS = "delete from job_skills where job_no = ?";
	private final String SQL_ADD_JOB_SKILLS = "insert into job_skills(job_no, skill_no, experience) values(?,?,?)";

	private JdbcTemplate jdbcTemplate;

	public JobDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int updateJob(JobBo job) {
		return jdbcTemplate.execute(new UpdateJobConnectionCallback(job));
	}

	private final class UpdateJobConnectionCallback implements ConnectionCallback<Integer> {
		private JobBo job;

		public UpdateJobConnectionCallback(JobBo job) {
			this.job = job;
		}

		@Override
		public Integer doInConnection(Connection con) throws SQLException, DataAccessException {
			int jupd = 0;
			PreparedStatement jobPstmt = null;
			PreparedStatement delSkillPstmt = null;
			PreparedStatement addSkillPstmt = null;

			try {
				jobPstmt = con.prepareStatement(SQL_UPD_JOB_BY_JOBNO);
				jobPstmt.setString(1, job.getTitle());
				jobPstmt.setString(2, job.getDescription());
				jobPstmt.setInt(3, job.getExperience());
				jobPstmt.setString(4, job.getLocation());
				jobPstmt.setDouble(5, job.getOfferedSalary());
				jobPstmt.setInt(6, job.getJobNo());
				jupd = jobPstmt.executeUpdate();

				delSkillPstmt = con.prepareStatement(SQL_DEL_JOB_SKILLS);
				delSkillPstmt.setInt(1, job.getJobNo());
				delSkillPstmt.executeUpdate();

				addSkillPstmt = con.prepareStatement(SQL_ADD_JOB_SKILLS);
				for (int skillNo : job.getSkills()) {
					addSkillPstmt.setInt(1, job.getJobNo());
					addSkillPstmt.setInt(2, skillNo);
					addSkillPstmt.setInt(3, 1);
					addSkillPstmt.executeUpdate();
				}

			} finally {
				if (jobPstmt != null) {
					jobPstmt.close();
				}
				if (delSkillPstmt != null) {
					delSkillPstmt.close();
				}
				if (addSkillPstmt != null) {
					addSkillPstmt.close();
				}
			}
			return jupd;
		}

	}
}
