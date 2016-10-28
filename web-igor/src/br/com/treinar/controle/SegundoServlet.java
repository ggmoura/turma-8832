package br.com.treinar.controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SegundoServlet
 */
@WebServlet({ "/SegundoServlet", "/cachorro" })
public class SegundoServlet extends HttpServlet {
	private String message;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Set response content type
		response.setContentType("text/html");
		// MONTA HTML DINAMICAMENTE
		message = "Fala mano...";
		PrintWriter out = response.getWriter();
		out.println(new Date());
		out.println("<h1>" + message + "</h1>");

	}

}
