package br.com.treinar.controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestScope
 */
@WebServlet("/requestscope")
public class RequestScope extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RequestScope() {
		super();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *		response)
	 */
	
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Integer cont = (Integer) (request.getAttribute("cont") != null ? request.getAttribute("cont") : 0);
		request.setAttribute("cont", ++cont);
		
		response.getWriter().print("cont=");
		response.getWriter().print(cont);
	
	}

}
