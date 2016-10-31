package br.com.treinar.agenda.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class TesteJDBC {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/agenda", "root", "");
		System.out.println(conn.isClosed());
<<<<<<< HEAD
		System.out.println("Francisco");
=======
		System.out.println("gleidson");
>>>>>>> branch 'master' of https://github.com/ggmoura/turma-8832.git
	}
	
}

