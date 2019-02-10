package com.qa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.qa.bo.CompanyBo;

public class CompanyDao {
	private final String SQL_GET_NO_OF_COMPANIES = "select count(1) from company";
	private final String SQL_GET_COMPANY_NM_BY_NO = "select company_nm from company where company_no = ?";
	private final String SQL_GET_COMPANY_BY_NO = "select company_no, company_nm, description, established_dt, location from company where company_no = ?";
	private final String SQL_FIND_COMPANIES_BY_NM = "select company_no, company_nm, description, established_dt, location from company where company_nm like ?";
	private final String SQL_GET_ALL_COMPANY_NM_AND_LOCATION = "select company_nm, location from company";
	private final String SQL_INS_COMPANY = "insert into company(company_no, company_nm, description, established_dt, location) values(?,?,?,?,?)";
	private final String SQL_GET_ALL_COMPANIES = "select company_no, company_nm, description, established_dt, location from company order by company_nm";

	private JdbcTemplate jdbcTemplate;

	public CompanyDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int findNoOfCompanies() {
		return jdbcTemplate.queryForInt(SQL_GET_NO_OF_COMPANIES);
	}

	public String findCompanyNameByNo(int companyNo) {
		return jdbcTemplate.queryForObject(SQL_GET_COMPANY_NM_BY_NO, String.class, companyNo);
	}

	public CompanyBo findCompanyByNo(int companyNo) {
		return jdbcTemplate.queryForObject(SQL_GET_COMPANY_BY_NO, new CompanyRowMapper(), companyNo);
	}

	public List<CompanyBo> findCompaniesByName(String companyName) {
		return jdbcTemplate.query(SQL_FIND_COMPANIES_BY_NM, new CompanyRowMapper(), "%" + companyName + "%");
	}

	public List<Map<String, Object>> getCompanyNameAndLocation() {
		return jdbcTemplate.queryForList(SQL_GET_ALL_COMPANY_NM_AND_LOCATION);
	}

	public int insertCompany(CompanyBo bo) {
		return jdbcTemplate.update(SQL_INS_COMPANY, bo.getCompanyNo(), bo.getCompanyName(), bo.getDescription(),
				bo.getEstablishedDate(), bo.getLocation());
	}

	public List<CompanyBo> getAllCompaniesByPagination(int pageSize, int pageNo) {
		return jdbcTemplate.query(SQL_GET_ALL_COMPANIES, new CompanyResultSetExtractorByPagination(pageSize, pageNo));
	}

	private final class CompanyRowMapper implements RowMapper<CompanyBo> {
		@Override
		public CompanyBo mapRow(ResultSet rs, int rowNo) throws SQLException {
			CompanyBo bo = null;

			bo = new CompanyBo();
			bo.setCompanyNo(rs.getInt(1));
			bo.setCompanyName(rs.getString(2));
			bo.setDescription(rs.getString(3));
			bo.setEstablishedDate(rs.getDate(4));
			bo.setLocation(rs.getString(5));
			return bo;
		}

	}

	private final class CompanyResultSetExtractorByPagination implements ResultSetExtractor<List<CompanyBo>> {
		private int pageSize;
		private int pageNo;

		public CompanyResultSetExtractorByPagination(int pageSize, int pageNo) {
			this.pageSize = pageSize;
			this.pageNo = pageNo;
		}

		@Override
		public List<CompanyBo> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<CompanyBo> companies = null;
			CompanyBo bo = null;
			int startIndex = 0;
			int endIndex = 0;
			int row = 1;

			startIndex = (pageSize * (pageNo - 1)) + 1;
			endIndex = (pageSize * (pageNo - 1)) + pageSize;

			companies = new ArrayList<>();
			while (rs.next() && row <= endIndex) {
				if (row >= startIndex) {
					bo = new CompanyBo();
					bo.setCompanyNo(rs.getInt(1));
					bo.setCompanyName(rs.getString(2));
					bo.setDescription(rs.getString(3));
					bo.setEstablishedDate(rs.getDate(4));
					bo.setLocation(rs.getString(5));
					companies.add(bo);
				}
				row++;
			}

			return companies;
		}

	}
}
