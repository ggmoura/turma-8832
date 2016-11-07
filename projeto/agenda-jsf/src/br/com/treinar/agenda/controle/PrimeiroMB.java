package br.com.treinar.agenda.controle;

import javax.faces.bean.ManagedBean;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Pessoa;

@ManagedBean
public class PrimeiroMB {

	private Contato contato;

	public PrimeiroMB() {
		contato = new Contato();
		contato.setPessoa(new Pessoa());
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
