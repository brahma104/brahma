package com.udyog.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.udyog.helper.ConnectionManager;

public class SkillDao {
	public void showSkills() throws Exception {
		ConnectionManager connectionManager = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			connectionManager = ConnectionManager.getInstance();
			con = connectionManager.newConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from skill");
			while (rs.next()) {
				System.out.println(
						"skill Name :" + rs.getString("skill_nm") + " technology : " + rs.getString("technology"));
			}
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
	}
}
