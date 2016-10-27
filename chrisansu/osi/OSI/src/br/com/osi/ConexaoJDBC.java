package br.com.osi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexaoJDBC {

	private static ConexaoJDBC instance;

	private ConexaoJDBC() {
		super();
	}

	static {
		instance = new ConexaoJDBC();
	}

	public static ConexaoJDBC getInstance() {
		return instance;
	}

	public Connection getConnection() {
		try {
			// conexao com banco de dados online - nao informei a porta, deixei
			// a padrao 3306
			return DriverManager.getConnection("jdbc:mysql://mysql.chrisansu.com.br/chrisansu16", "chrisansu16",
					"adm7treinar");

		} catch (SQLException e) {
			// se a conexao falhar, mando uma mensagem para o usuário
			throw new RuntimeException(e);
		}
	}

	public PreparedStatement prepareStatement(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
