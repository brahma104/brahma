package com.npjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.npjdbc.bo.CompanyBo;

@Repository
public class CompanyDao {
	private final String SQL_FIND_NO_OF_COMPANIES_BY_LOCATION = "select count(1) from company where location = :p_location";
	private final String SQL_FIND_COMPANIES_BY_NM_AND_LOCATION = "select company_no, company_nm, description,established_dt, location from company where company_nm like :p_companyNm and location like :p_location";
	private final String SQL_INS_COMPANY = "insert into company(company_no, company_nm, description, established_dt, location) values(:companyNo, :companyName, :description, :establishedDate, :location)";

	private NamedParameterJdbcTemplate npJdbcTemplate;
	@Autowired
	private DataSource dataSource;

	@Autowired
	public CompanyDao(NamedParameterJdbcTemplate npJdbcTemplate) {
		this.npJdbcTemplate = npJdbcTemplate;
	}

	public int findNoOfCompaniesByLocation(String location) {
		Map<String, Object> paramMap = null;

		paramMap = new HashMap<>();
		paramMap.put("p_location", location);
		return npJdbcTemplate.queryForInt(SQL_FIND_NO_OF_COMPANIES_BY_LOCATION, paramMap);
	}

	public List<CompanyBo> findCompaniesByNameAndLocation(String companyName, String location) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("p_companyNm", "%" + companyName + "%");
		paramSource.addValue("p_location", "%" + location + "%");

		return npJdbcTemplate.query(SQL_FIND_COMPANIES_BY_NM_AND_LOCATION, paramSource, new CompanyRowMapper());
	}

	public int insertCompany(CompanyBo bo) {
		BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(bo);
		return npJdbcTemplate.update(SQL_INS_COMPANY, paramSource);
	}

	public int simpleInsertCompany(CompanyBo bo) {
		MapSqlParameterSource paramSource = null;
		SimpleJdbcInsert sji = null;

		paramSource = new MapSqlParameterSource();
		paramSource.addValue("company_no", bo.getCompanyNo());
		paramSource.addValue("company_nm", bo.getCompanyName());
		paramSource.addValue("description", bo.getDescription());
		paramSource.addValue("established_dt", bo.getEstablishedDate());
		paramSource.addValue("location", bo.getLocation());
		sji = new SimpleJdbcInsert(dataSource);
		sji.setTableName("company");
		return sji.execute(paramSource);

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
}
