package br.com.treinar.agenda.controle;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Pessoa;
import br.com.treinar.agenda.modelo.Telefone;

@ManagedBean
@SessionScoped
public class PrimeiroMB {

	private Contato contato;

	public PrimeiroMB() {
		contato = criarContato();
	}

	private Contato criarContato() {
		Contato contato = new Contato();
		contato.setId(10L);
		contato.setPessoa(new Pessoa());
		contato.getPessoa().setDataNascimento(new Date());
		contato.setTelefone(new Telefone());
		contato.getTelefone().setDdd(31);
		contato.getTelefone().setNumero(987749131);
		return contato;
	}
	
	public void gravarPessoa() {
		System.out.println(contato.getPessoa().getNome());
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}
