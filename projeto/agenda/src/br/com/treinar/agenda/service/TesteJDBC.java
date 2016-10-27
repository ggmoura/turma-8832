package br.com.treinar.agenda.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class TesteJDBC {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/agenda", "root", "");
		System.out.println(conn.isClosed());
		System.out.println("Francisco");
	}
	
}

