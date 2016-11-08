package br.com.treinar.agenda;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Pessoa;
import br.com.treinar.agenda.modelo.Telefone;
import br.com.treinar.agenda.modelo.TipoTelefone;

public class Util {

	private static Util instance;
	private List<Contato> contatos;
	
	private Util() {
		contatos = new ArrayList<Contato>();
		Contato contato = new Contato();
		contato.setEmail("email1@gmail.com");
		contato.setId(10L);
		contato.setPessoa(new Pessoa());
		contato.getPessoa().setNome("Maria Sophia");
		contato.getPessoa().setDataNascimento(new Date());
		contato.setTelefone(new Telefone());
		contato.getTelefone().setDdd(31);
		contato.getTelefone().setNumero(987749131);
		contato.getTelefone().setTipoTelefone(TipoTelefone.CELULAR);
		
		Contato contato1 = new Contato();
		contato1.setEmail("email2@gmail.com");
		contato1.setId(10L);
		contato1.setPessoa(new Pessoa());
		contato1.getPessoa().setNome("Marta Silva");
		contato1.getPessoa().setDataNascimento(new Date());
		contato1.setTelefone(new Telefone());
		contato1.getTelefone().setDdd(31);
		contato1.getTelefone().setNumero(987749131);
		contato1.getTelefone().setTipoTelefone(TipoTelefone.CELULAR);
		contatos.add(contato);
		contatos.add(contato1);
		
	}
	
	static {
		instance = new Util();
	}
	
	public static Util getInstance() {
		return instance;
	}
	
	public List<Contato> getContatos() {
		return contatos;
	}
	
	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	
	
}
