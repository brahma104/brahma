package com.qa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

public class SkillDao {
	private final String SQL_INS_SKILL = "insert into skill(skill_nm, technology) values(?,?)";
	private JdbcTemplate jdbcTemplate;

	public SkillDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insertSkillAndGetSkillNo(final String skillName, final String technology) {
		KeyHolder kh = new GeneratedKeyHolder();
		int skillNo = 0;

		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pstmt = null;

				pstmt = con.prepareStatement(SQL_INS_SKILL, new String[] { "skill_no" });
				pstmt.setString(1, skillName);
				pstmt.setString(2, technology);
				return pstmt;
			}
		}, kh);
		skillNo = kh.getKey().intValue();
		return skillNo;
	}

}
