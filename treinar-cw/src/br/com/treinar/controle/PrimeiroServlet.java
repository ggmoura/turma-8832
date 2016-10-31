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
import javax.xml.ws.Response;

/**
 * Servlet implementation class PrimeiroServlet
 */
@WebServlet({ "/PrimeiroServlet", "/abacaxi" })
public class PrimeiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @throws IOException 
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	
	@Override
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		//set response content type
		response.setContentType("text/html");
	
		//Actual logic goes here
		PrintWriter out = response.getWriter();
		out.println("<h1>");
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		out.println("Ol�, hoje � ");
		out.print(format.format(new Date()));
		out.println("</h1>");
		
	}

}
