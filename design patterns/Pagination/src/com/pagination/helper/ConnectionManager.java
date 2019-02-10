package com.pagination.helper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.pagination.exception.GenericException;

public class ConnectionManager {
	private static ConnectionManager instance;
	private ThreadLocal<Connection> localConnections;
	protected String driverClassname;
	protected String url;
	protected String username;
	protected String password;

	private ConnectionManager() {
		Properties props = new Properties();
		try {
			props.load(this.getClass().getClassLoader().getResourceAsStream("db.properties"));
			driverClassname = props.getProperty("db.driverClassname");
			url = props.getProperty("db.url");
			username = props.getProperty("db.username");
			password = props.getProperty("db.password");
			Class.forName(driverClassname);
		} catch (IOException | ClassNotFoundException e) {
			throw new GenericException("unable to read the properties", e);
		}
		localConnections = new ThreadLocal<>();
	}

	public static ConnectionManager getInstance() {
		if (instance == null) {
			synchronized (ConnectionManager.class) {
				if (instance == null) {
					instance = new ConnectionManager();
				}
			}
		}
		return instance;
	}

	public Connection getConnection() {
		Connection con = null;

		con = localConnections.get();
		try {
			if (con == null || con.isClosed() == true) {
				con = DriverManager.getConnection(url, username, password);
				localConnections.set(con);
			}
		} catch (SQLException e) {
			throw new GenericException("unable to create connection", e);
		}
		return con;
	}

	public void closeConnection() {
		Connection con = null;

		con = localConnections.get();
		try {
			if (con != null && con.isClosed() == false) {
				con.close();
				localConnections.set(null);
			}
		} catch (SQLException e) {
			throw new GenericException("unable to create connection", e);
		}
	}
}
