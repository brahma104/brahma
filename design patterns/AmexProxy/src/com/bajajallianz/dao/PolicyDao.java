package com.bajajallianz.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bajajallianz.bo.MedicalPolicy;
import com.bajajallianz.util.ConnectionManager;

public class PolicyDao {
	private final String GET_POLICIES = "select policy_no, policy_nm, policy_type, min_tenure, max_tenure, premium_amount, provider_id from medicalpolicies";

	public List<MedicalPolicy> getAllPolicies() throws SQLException {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<MedicalPolicy> medicalPolicies = null;

		try {
			con = ConnectionManager.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(GET_POLICIES);
			medicalPolicies = new ArrayList<>();
			while (rs.next()) {
				medicalPolicies.add(new MedicalPolicy(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
						rs.getInt(5), rs.getFloat(6), rs.getString(7)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			ConnectionManager.closeConnection();
		}
		return medicalPolicies;
	}
}
