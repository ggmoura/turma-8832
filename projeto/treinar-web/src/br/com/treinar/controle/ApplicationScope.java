package br.com.treinar.controle;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ApplicationScope")
public class ApplicationScope extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		config.getServletContext().setAttribute("contador", 0);
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer contador = (Integer)request.getServletContext().getAttribute("contador");
		request.getServletContext().setAttribute("contador", ++contador);
		response.getWriter().print(contador);
	}

}
