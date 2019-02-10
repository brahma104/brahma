package com.ca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.StatementCallback;

import com.ca.bo.CompanyBo;

public class CompanyDao {
	// sql queries
	private final String SQL_FIND_COMPANIES_BY_NM = "select company_no, company_nm, description, established_dt, location from company where company_nm like ?";
	private final String SQL_GET_ALL_COMPANIES = "select company_no, company_nm, description, established_dt, location from company";

	// logic
	private JdbcTemplate jdbcTemplate;

	public CompanyDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<CompanyBo> findCompaniesByName(String companyName) {
		return jdbcTemplate.execute(new FindCompaniesByNameCreator(companyName), new FindCompaniesByNameCallback());
	}

	public List<CompanyBo> getAllCompanies() {
		return jdbcTemplate.execute(new GetAllCompaniesCallback());
	}
	
	private final class FindCompaniesByNameCreator implements PreparedStatementCreator {
		private String companyName;

		public FindCompaniesByNameCreator(String companyName) {
			this.companyName = companyName;
		}

		@Override
		public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
			PreparedStatement pstmt = null;

			pstmt = con.prepareStatement(SQL_FIND_COMPANIES_BY_NM);
			pstmt.setString(1, "%" + companyName + "%");
			return pstmt;
		}
	}

	private final class FindCompaniesByNameCallback implements PreparedStatementCallback<List<CompanyBo>> {
		@Override
		public List<CompanyBo> doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
			ResultSet rs = null;
			CompanyBo bo = null;
			List<CompanyBo> companies = null;

			rs = pstmt.executeQuery();
			companies = new ArrayList<>();
			while (rs.next()) {
				bo = new CompanyBo();
				bo.setCompanyNo(rs.getInt(1));
				bo.setCompanyName(rs.getString(2));
				bo.setDescription(rs.getString(3));
				bo.setEstablishedDate(rs.getDate(4));
				bo.setLocation(rs.getString(5));
				companies.add(bo);
			}
			return companies;
		}
	}

	private final class GetAllCompaniesCallback implements StatementCallback<List<CompanyBo>> {
		@Override
		public List<CompanyBo> doInStatement(Statement stmt) throws SQLException, DataAccessException {
			ResultSet rs = null;
			CompanyBo bo = null;
			List<CompanyBo> companies = null;

			rs = stmt.executeQuery(SQL_GET_ALL_COMPANIES);
			companies = new ArrayList<>();
			while (rs.next()) {
				bo = new CompanyBo();
				bo.setCompanyNo(rs.getInt(1));
				bo.setCompanyName(rs.getString(2));
				bo.setDescription(rs.getString(3));
				bo.setEstablishedDate(rs.getDate(4));
				bo.setLocation(rs.getString(5));
				companies.add(bo);
			}
			return companies;
		}
	}
}
