package com.formsec.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.formsec.bo.RoleBo;
import com.formsec.bo.UserBo;

public class UserAccountDao {
	private final String GET_USER_WITH_ROLE = "select u.*, r.* from user_account u inner join role r on u.role_id = r.role_id where u.username = ?";
	private JdbcTemplate jdbcTemplate;

	public UserAccountDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public UserBo getUser(String username) {
		return jdbcTemplate.queryForObject(GET_USER_WITH_ROLE, new RowMapper<UserBo>() {
			@Override
			public UserBo mapRow(ResultSet rs, int rowNum) throws SQLException {
				UserBo userBo = null;
				RoleBo roleBo = null;

				roleBo = new RoleBo(rs.getInt("r.role_id"), rs.getString("r.role_nm"));
				userBo = new UserBo();
				userBo.setUserId(rs.getInt("u.user_account_no"));
				userBo.setUsername(rs.getString("u.username"));
				userBo.setPassword(rs.getString("u.password"));
				userBo.setLocked(rs.getInt("u.locked"));
				userBo.setDisabled(rs.getInt("u.disabled"));
				userBo.setRole(roleBo);
				return userBo;
			}

		}, new Object[] { username });
	}
}
