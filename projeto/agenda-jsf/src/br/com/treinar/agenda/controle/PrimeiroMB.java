package br.com.treinar.agenda.controle;

import java.util.Date;

import javax.faces.bean.ManagedBean;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Pessoa;
import br.com.treinar.agenda.modelo.Telefone;
import br.com.treinar.agenda.modelo.TipoTelefone;

@ManagedBean
public class PrimeiroMB {

	private Contato contato;
	private TipoTelefone[] tipos;

	public PrimeiroMB() {
		tipos = TipoTelefone.values();
		contato = new Contato();
		contato.setPessoa(new Pessoa());
		contato.getPessoa().setDataNascimento(new Date());
		contato.setTelefone(new Telefone());
		contato.getTelefone().setDdd(31);
		contato.getTelefone().setNumero(987749131);
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

	public TipoTelefone[] getTipos() {
		return tipos;
	}

	public void setTipos(TipoTelefone[] tipos) {
		this.tipos = tipos;
	}

}
