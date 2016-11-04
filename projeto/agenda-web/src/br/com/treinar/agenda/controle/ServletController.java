package br.com.treinar.agenda.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.service.Comando;

@WebServlet("*.trn")
public class ServletController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String comandoStr = req.getParameter("comando");
		try {
			Comando comando = (Comando) Class.forName(comandoStr).newInstance();
			comando.executar(req, resp);
			System.out.println(comando);
		} catch (Exception e) {
			//comandoStr.toString();
		}
		
	}
	
}
