package com.udyog.helper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
	private static ConnectionManager instance;
	private Properties dbProperties;
	private ThreadLocal<Connection> localConnections;

	private ConnectionManager() throws IOException, ClassNotFoundException {
		dbProperties = new Properties();
		dbProperties.load(this.getClass().getClassLoader().getResourceAsStream("db.properties"));
		Class.forName(dbProperties.getProperty("db.driverClassname"));
		localConnections = new ThreadLocal<>();
	}

	public static ConnectionManager getInstance() throws IOException, ClassNotFoundException {
		if (instance == null) {
			synchronized (ConnectionManager.class) {
				if (instance == null) {
					instance = new ConnectionManager();
				}

			}
		}
		return instance;
	}

	public Connection newConnection() throws SQLException {
		Connection con = null;

		if (localConnections.get() == null || localConnections.get().isClosed() == true) {
			con = DriverManager.getConnection(dbProperties.getProperty("db.url"),
					dbProperties.getProperty("db.username"), dbProperties.getProperty("db.password"));
			con.setAutoCommit(false);
			localConnections.set(con);
		}
		return localConnections.get();
	}
}















