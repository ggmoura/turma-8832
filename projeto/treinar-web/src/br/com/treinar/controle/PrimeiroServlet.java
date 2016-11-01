package br.com.treinar.controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeiroServlet
 */
@WebServlet(urlPatterns = { "/PrimeiroServlet", "/abacaxi" }, loadOnStartup = 1)
public class PrimeiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		super.init();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
		response.setContentType("text/html");

		Enumeration<String> parameterNames = request.getParameterNames();
		while (parameterNames.hasMoreElements()) {
			System.out.println(parameterNames.nextElement());
		}
		
		PrintWriter out = response.getWriter();
		String title = "Using GET Method to Read Form Data";
		String docType = "<!doctype html>\n";
		out.println(docType + "<html>\n" + "<head><title>" + title
				+ "</title></head>\n" + "<body bgcolor=\"#f0f0f0\">\n"
				+ "<h1 align=\"center\">" + title + "</h1>\n" + "<ul>\n"
				+ "  <li><b>First Name</b>: "
				+ request.getParameter("email") + "\n"
				+ "  <li><b>Last Name</b>: "
				+ request.getParameter("senha") + "\n" + "</ul>\n"
				+ "</body></html>");
		
		String[] opcoes = request.getParameterValues("opcao");
		for (String opcao : opcoes) {
			System.out.println(opcao);
		}
	}

	@Override
	public void destroy() {
		super.destroy();
	}

}
