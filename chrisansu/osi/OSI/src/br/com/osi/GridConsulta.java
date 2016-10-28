package br.com.osi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GridConsulta {

	public List<String[]> recuperaraTodos() {

		String[] campos = null;
		 List<String[]> retorno = new ArrayList<>();
		try {
			Connection conn = ConexaoJDBC.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement("select * from clientes");

			ResultSet rs = stmt.executeQuery();
			

			while (rs.next()) {
				 
				campos = new String[3];
				
				campos[0] = Integer.valueOf(rs.getInt("id")).toString();
				campos[1] = rs.getString("RAZAO_SOCIAL");
				campos[2] = rs.getString("EMAIL");
			
				retorno.add(campos);
			}
			
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception f) {
			throw new RuntimeException(f);
		}
		return retorno;
	}
}
