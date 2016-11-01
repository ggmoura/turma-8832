package br.com.treinar.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionScope
 */
@WebServlet("/SessionScope")
public class SessionScope extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SessionScope() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession sessao = request.getSession();
		Integer cont = (Integer) (sessao.getAttribute("cont") != null ? sessao.getAttribute("cont") : 0);
		sessao.setAttribute("cont", ++cont);
		
		response.getWriter().print("cont=");
		response.getWriter().print(cont);
	}
	
}
