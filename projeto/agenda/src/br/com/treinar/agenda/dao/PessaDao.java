package br.com.treinar.agenda.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import br.com.treinar.agenda.modelo.Pessoa;

public class PessaDao {

	public void inserir(Pessoa pessoa) {
		StringBuilder sql = new StringBuilder();
		sql.append("insert into pessoa (nome, sexo, dataNascimento) values (?, ?, ?)");
		try {
			Connection conn = ConnectionFactory.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql.toString());
			stmt.setString(1, pessoa.getNome());
			stmt.setInt(2, pessoa.getSexo().ordinal());
			stmt.setDate(3, new Date(pessoa.getDataNascimento().getTime()));
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			System.out.println("erro...");
		}
	}

	public void excluir(Pessoa pessoa) {
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("delete from contatos where id = ").append("?");
			Connection conn = ConnectionFactory.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql.toString());
			stmt.setLong(1, pessoa.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Pessoa recuperar(Long id) {
		Pessoa pessoa = null;
		try {
			Connection conn = ConnectionFactory.getInstance().getConnection();
			PreparedStatement stmt = conn
					.prepareStatement("select * from pessoa where id = ?");
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				pessoa = new Pessoa();
				pessoa.setId(rs.getLong("id"));
				pessoa.setNome(rs.getString("nome"));
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				pessoa.setDataNascimento(data.getTime());
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return pessoa;
	}

	public void atualizar(Pessoa pessoa) {

		String sql = "update pessoa set nome = ?, sexo = ?, dataNascimento = ? where id = ?";
		try {
			Connection conn = ConnectionFactory.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, pessoa.getNome());
			stmt.setInt(2, pessoa.getSexo().ordinal());
			stmt.setDate(3, new Date(pessoa.getDataNascimento().getTime()));
			stmt.setLong(4, pessoa.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
