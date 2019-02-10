package com.udyog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.udyog.bo.JobBo;

public class JobDao {
	private final String SQL_INS_JOB = "insert into jobs(title, description, experience, location, offered_salary, company_no) values(?,?,?,?,?,?)";
	private JdbcTemplate jdbcTemplate;

	public JobDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveJob(JobBo jobBo) {
		KeyHolder kh = null;

		kh = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pstmt = null;
				pstmt = con.prepareStatement(SQL_INS_JOB, new String[] { "job_no" });
				pstmt.setString(1, jobBo.getTitle());
				pstmt.setString(2, jobBo.getDescription());
				pstmt.setInt(3, jobBo.getExperience());
				pstmt.setString(4, jobBo.getLocation());
				pstmt.setDouble(5, jobBo.getOfferedSalary());
				pstmt.setInt(6, jobBo.getCompanyNo());

				return pstmt;
			}
		}, kh);
		return kh.getKey().intValue();
	}

}
