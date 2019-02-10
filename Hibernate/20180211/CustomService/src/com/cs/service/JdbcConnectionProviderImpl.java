package com.cs.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.exception.spi.Configurable;
import org.hibernate.service.spi.Startable;
import org.hibernate.service.spi.Stoppable;

public class JdbcConnectionProviderImpl implements ConnectionProvider, Startable, Stoppable, Configurable {

	@Override
	public void configure(Properties properties) throws HibernateException {
		System.out.println("configure()");
	}

	@Override
	public void stop() {
		System.out.println("stopping...");
	}

	@Override
	public void start() {
		System.out.println("starting...");
	}

	@Override
	public boolean isUnwrappableAs(Class classType) {
		return false;
	}

	@Override
	public <T> T unwrap(Class<T> classType) {
		return null;
	}

	@Override
	public void closeConnection(Connection connection) throws SQLException {
		if (connection != null && connection.isClosed() == false) {
			connection.close();
			System.out.println("closeConnection()...");
		}
	}

	@Override
	public Connection getConnection() throws SQLException {
		Connection con = null;

		System.out.println("getConnection()");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hdb", "root", "root");
		con.setAutoCommit(false);
		return con;
	}

	@Override
	public boolean supportsAggressiveRelease() {
		return false;
	}

}
