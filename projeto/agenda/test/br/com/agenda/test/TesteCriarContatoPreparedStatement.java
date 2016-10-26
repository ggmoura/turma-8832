package br.com.agenda.test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Calendar;

import br.com.treinar.agenda.dao.ConnectionFactory;
import br.com.treinar.agenda.modelo.Sexo;

public class TesteCriarContatoPreparedStatement {

	public static void main(String[] args) throws Exception {

		String nome = "Ana Madalena Moura";
		
		Calendar calendario = Calendar.getInstance();
		
		calendario.set(Calendar.YEAR, 1958);
		calendario.set(Calendar.MONTH, 9);
		calendario.set(Calendar.DAY_OF_MONTH, 27);
		
		Date hoje = new Date(calendario.getTimeInMillis());

		StringBuilder sql = new StringBuilder();
		sql.append("insert into pessoa (nome, sexo, dataNascimento) values (?, ?, ?)");

		Connection conn = ConnectionFactory.getInstance().getConnection();

		PreparedStatement stmt = conn.prepareStatement(sql.toString());
		stmt.setString(1, nome);
		stmt.setInt(2, Sexo.M.ordinal());
		stmt.setDate(3, hoje);
		
		stmt.execute();
		stmt.close();

	}

}
