package br.com.treinar.controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeiroServlet
 */
@WebServlet({ "/PrimeiroServlet", "/abacaxi" })
public class PrimeiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		out.println("<h1>");
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		out.println("Olá, estou no método doGet, hoje é ");
		out.print(format.format(new Date()));
		out.println("</h1>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<h1>");
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		out.println("Olá, estou no método doPost, hoje é ");
		out.print(format.format(new Date()));
		out.println("</h1>");
	}
	
	
	
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		out.println("<h1>");
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		out.println("Olá, hoje é ");
		out.print(format.format(new Date()));
		out.println("</h1>");
	}

}
