package br.com.treinar.agenda.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.util.Storage;

public class ListaContatosComando implements Comando {

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.getWriter().println("Lista Contato Comando");
		req.setAttribute("contatos", Storage.getInstance().getContatos());
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("pages/lista-contato.jsp");
		requestDispatcher.forward(req, resp);
		
	}

}
