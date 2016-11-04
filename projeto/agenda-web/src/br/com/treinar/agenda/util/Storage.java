package br.com.treinar.agenda.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Pessoa;
import br.com.treinar.agenda.modelo.Sexo;
import br.com.treinar.agenda.modelo.Telefone;
import br.com.treinar.agenda.modelo.TipoTelefone;

public class Storage {

	private static Storage instance;
	private List<Contato> contatos;

	private Storage() {
		contatos = new ArrayList<Contato>();
		mocContatos();
	}

	private void mocContatos() {
		Contato c = new Contato();
		c.setPessoa(new Pessoa());
		c.setEmail("maria@gmail.com");
		c.getPessoa().setNome("Maria Sophia");
		c.getPessoa().setSexo(Sexo.F);
		c.getPessoa().setDataNascimento(new Date());
		c.setTelefone(new Telefone());
		c.getTelefone().setNumero(987749131);
		c.getTelefone().setDdd(31);
		c.getTelefone().setTipoTelefone(TipoTelefone.CELULAR);
		
		contatos.add(c);
	}

	static {
		instance = new Storage();
	}

	public static Storage getInstance() {
		return instance;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

}
