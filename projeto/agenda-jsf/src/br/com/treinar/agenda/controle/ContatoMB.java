package br.com.treinar.agenda.controle;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import br.com.treinar.agenda.Util;
import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Pessoa;
import br.com.treinar.agenda.modelo.Telefone;

@ViewScoped
@ManagedBean
public class ContatoMB {

	private List<Contato> contatos;
	private Contato contato;
	
	@ManagedProperty(value="#{primeiroMB}")
	private PrimeiroMB primeiroMB;
	
	public ContatoMB() {
		contato = new Contato();
		contato.setPessoa(new Pessoa());
		contato.setTelefone(new Telefone());
		contatos = Util.getInstance().getContatos();
	}
	
	public void sair() {
		System.out.println(primeiroMB);
		System.out.println(contatos);
	}
	
	public String editar(Contato contato) {
		this.contato = contato;
		return "/pages/contato/detalhe.xhtml";
	}
	
	public void fazerEdicao() {
		
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public PrimeiroMB getPrimeiroMB() {
		return primeiroMB;
	}

	public void setPrimeiroMB(PrimeiroMB primeiroMB) {
		this.primeiroMB = primeiroMB;
	}

}
