package br.com.treinar.agenda.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static ConnectionFactory instance;
	
	private ConnectionFactory() {
		super();
	}
	
	static {
		instance = new ConnectionFactory();
	}
	
	public static ConnectionFactory getInstance() {
		return instance;
	}
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/agenda",
					"root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
