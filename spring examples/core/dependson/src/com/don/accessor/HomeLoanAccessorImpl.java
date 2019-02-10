package com.don.accessor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.don.beans.LoanParameter;

public class HomeLoanAccessorImpl implements IAccessor {
	protected String identifier;

	public HomeLoanAccessorImpl(String identifier) {
		this.identifier = identifier;
	}

	@Override
	public Object getData() throws Exception {
		List<LoanParameter> loanParameters = null;
		LoanParameter loanParameter = null;
		Statement stmt = null;
		Connection con = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdb", "root", "root");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from loan_parameters where loan_type = 'home'");
			loanParameters = new ArrayList<>();
			while (rs.next()) {
				loanParameter = new LoanParameter();
				loanParameter.setLoanType(rs.getString("loan_type"));
				loanParameter.setMinPrincipleAmount(rs.getInt("min_principle_amt"));
				loanParameter.setMaxPrincipleAmount(rs.getInt("max_principle_amt"));
				loanParameter.setMinTenure(rs.getInt("min_tenrue"));
				loanParameter.setMaxTenure(rs.getInt("max_tenure"));
				loanParameter.setPlace(rs.getString("place"));
				loanParameter.setInterestRate(rs.getFloat("interest_rate"));
				loanParameters.add(loanParameter);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw e;
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

		return loanParameters;
	}

	@Override
	public String getIdentifier() {
		return identifier;
	}

}
