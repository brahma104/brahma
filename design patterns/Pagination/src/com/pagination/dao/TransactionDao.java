package com.pagination.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pagination.bo.TransactionBo;
import com.pagination.helper.ConnectionManager;

public class TransactionDao {
	private final String SQL_GET_TRANSACTIONS = "select transaction_no, transaction_dt, description, merchant_nm, amount from transactions order by ";
	private final String SQL_COUNT_OF_TRANSACTIONS = "select count(1) from transactions";

	public List<TransactionBo> getTransactions(int pageSize, int pageNo, String sortColumn, String sortOrder) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = null;
		int startIndex = 0;
		int endIndex = 0;
		int row = 1;
		ConnectionManager connectionManager = null;
		List<TransactionBo> transactions = null;

		try {
			startIndex = (pageSize * (pageNo - 1)) + 1;
			endIndex = (pageSize * pageNo);

			connectionManager = ConnectionManager.getInstance();
			con = connectionManager.getConnection();
			stmt = con.createStatement();
			sql = prepareSQL(SQL_GET_TRANSACTIONS, sortColumn, sortOrder);
			rs = stmt.executeQuery(sql);
			transactions = new ArrayList<>();
			while (rs.next() && row <= endIndex) {
				if (row >= startIndex) {
					transactions.add(new TransactionBo(rs.getInt(1), new java.util.Date(rs.getDate(2).getTime()),
							rs.getString(3), rs.getString(4), rs.getFloat(5)));
				}
				row++;
			}
		} catch (SQLException e) {

		} finally {
			connectionManager.closeConnection();
		}
		return transactions;
	}

	public int getNoOfTransactions() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		int c = -1;
		ConnectionManager connectionManager = null;

		try {

			connectionManager = ConnectionManager.getInstance();
			con = connectionManager.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL_COUNT_OF_TRANSACTIONS);
			if (rs.next()) {
				c = rs.getInt(1);
			}
		} catch (SQLException e) {

		} finally {
			connectionManager.closeConnection();
		}
		return c;
	}

	private String prepareSQL(String sql, final String sortColumn, final String sortOrder) {
		String pSQL = null;

		pSQL = sql + " " + sortColumn + " " + sortOrder;
		return pSQL;
	}
}
