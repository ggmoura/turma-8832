package br.com.treinar.agenda.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.treinar.agenda.modelo.Pessoa;
import br.com.treinar.agenda.modelo.Sexo;

public class PessoaDAO implements IBaseDAO<Pessoa> {

	public void inserir(Pessoa pessoa) {

		StringBuilder sql = new StringBuilder();
		sql.append("insert into pessoa (nome, sexo, dataNascimento) values (?, ?, ?)");
		try {
			Connection conn = ConnectionFactory.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, pessoa.getNome());
			stmt.setInt(2, pessoa.getSexo().ordinal());
			stmt.setDate(3, new Date(pessoa.getDataNascimento().getTime()));
			stmt.execute();
			ResultSet rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
			   pessoa.setId(rs.getLong(1));
			}
			stmt.close();
		} catch (Exception e) {
			System.out.println("erro...");
		}
	}

	public void excluir(Pessoa pessoa) {
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("delete from pessoa where id = ").append("?");
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
				int indexSexo = rs.getInt("sexo");
				pessoa.setSexo(Sexo.values()[indexSexo]);
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
	
	@Override
	public List<Pessoa> listarTodos() {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		Pessoa pessoa = null;
		try {
			Connection conn = ConnectionFactory.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement("select * from pessoa");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				pessoa = new Pessoa();
				pessoa.setId(rs.getLong("id"));
				pessoa.setNome(rs.getString("nome"));
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				Integer indexSexo = rs.getInt("sexo");
				pessoa.setSexo(Sexo.values()[indexSexo]);
				pessoa.setDataNascimento(data.getTime());
				pessoas.add(pessoa);
			}
			rs.close();
			stmt.close();
			return pessoas;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}
