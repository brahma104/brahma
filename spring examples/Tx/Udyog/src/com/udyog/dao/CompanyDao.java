package com.udyog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.udyog.bo.CompanyBo;

public class CompanyDao {
	private final String SQL_INS_COMPANY = "insert into company(company_nm, description, established_dt, location) values(?,?,?,?)";
	private JdbcTemplate jdbcTemplate;

	public CompanyDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveCompany(final CompanyBo companyBo) {
		KeyHolder kh = null;

		kh = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pstmt = null;
				pstmt = con.prepareStatement(SQL_INS_COMPANY, new String[] { "company_no" });
				pstmt.setString(1, companyBo.getCompanyName());
				pstmt.setString(2, companyBo.getDescription());
				pstmt.setDate(3, new java.sql.Date(companyBo.getEstablishedDate().getTime()));
				pstmt.setString(4, companyBo.getLocation());

				return pstmt;
			}
		}, kh);
		return kh.getKey().intValue();
	}

}
