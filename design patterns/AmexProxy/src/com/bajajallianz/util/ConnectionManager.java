package com.bajajallianz.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
	private static Properties props = new Properties();
	private static ThreadLocal<Connection> managedConnections;
	static {
		try {
			props.load(ConnectionManager.class.getClassLoader().getResourceAsStream("db.properties"));
			Class.forName(props.getProperty("db.driverClassname"));
			managedConnections = new ThreadLocal<>();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		Connection con = null;

		con = managedConnections.get();
		if (con == null || con.isClosed() == true) {
			con = DriverManager.getConnection(props.getProperty("db.url"), props.getProperty("db.username"),
					props.getProperty("db.password"));
			managedConnections.set(con);
		}
		return con;
	}

	public static void closeConnection() throws SQLException {
		Connection con = null;

		con = managedConnections.get();
		if (con != null && con.isClosed() == false) {
			con.close();
		}
	}
}
