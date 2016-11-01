package br.com.treinar.controle;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/redirect" }, loadOnStartup = 1)
public class RedirectServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		List<TipoConta> tipos = Arrays.asList(TipoConta.values());
		
		req.setAttribute("TIPOS_CONTA", tipos);
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("primeira-jsp.jsp");
		requestDispatcher.forward(req, resp);
		
	}

}
