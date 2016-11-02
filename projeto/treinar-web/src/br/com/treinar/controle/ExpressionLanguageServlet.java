package br.com.treinar.controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExpressionLanguageServlet
 */
@WebServlet("/ExpressionLanguageServlet")
public class ExpressionLanguageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ExpressionLanguageServlet() {
		super();
	}


	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setAttribute("nomeRequisicao", "Maria Sophia");
		req.getSession().setAttribute("nomeSessao", "Isabela");
		req.getServletContext().setAttribute("nomeAplicacao", "Nathalia");
		
		req.getRequestDispatcher("segunda-jsp.jsp").forward(req, resp);
	}

}
