package br.com.agenda.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.treinar.agenda.modelo.Sexo;

public class TesteCriarContato {

	public static void main(String[] args) throws SQLException {

		String nome = "Gleidson";
		
		StringBuilder sql = new StringBuilder();
		sql.append("insert into pessoa").append(" ");
		sql.append("(nome, sexo, dataNascimento)").append(" ");
		sql.append("values ('");
		sql.append(nome).append("', ");
		sql.append(Sexo.M.ordinal()).append(", ");
		sql.append("'1980-12-09'");
		sql.append(")");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/agenda", "root", "");
		
		Statement stmt = conn.createStatement();
		stmt.execute(sql.toString());
		stmt.close();
		
	}
	
}
