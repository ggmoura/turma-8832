package br.com.treinar.agenda.service;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Pessoa;
import br.com.treinar.agenda.modelo.Sexo;
import br.com.treinar.agenda.modelo.Telefone;
import br.com.treinar.agenda.modelo.TipoTelefone;
import br.com.treinar.agenda.util.Storage;

public class CadastroContatoComando implements Comando {

	@Override
	public void executar(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String nome = req.getParameter("nome");
		String ddd = req.getParameter("ddd");
		String numero = req.getParameter("numero");
		String tipoTelefone = req.getParameter("tipoTelefone");
		String dataNascimento = req.getParameter("dataNascimento");
		String email = req.getParameter("email");
		String sexo = req.getParameter("sexo");
		
		Contato c = new Contato();
		c.setEmail(email);
		c.setPessoa(new Pessoa());
		c.getPessoa().setNome(nome);
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		try {
			c.getPessoa().setDataNascimento(formatador.parse(dataNascimento));
		} catch (ParseException e) {
			c.getPessoa().setDataNascimento(null);
		}
		c.getPessoa().setSexo(Sexo.valueOf(sexo));
		c.setTelefone(new Telefone());
		c.getTelefone().setDdd(Integer.valueOf(ddd));
		c.getTelefone().setNumero(Integer.valueOf(numero));
		c.getTelefone().setTipoTelefone(TipoTelefone.valueOf(tipoTelefone));
		
		Storage.getInstance().getContatos().add(c);
		
		resp.getWriter().println("Gravado com sucesso!");
		
	}

}
