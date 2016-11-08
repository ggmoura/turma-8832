package br.com.treinar.agenda.controle;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.treinar.agenda.modelo.TipoTelefone;

@ManagedBean(name="util")
@ApplicationScoped
public class ApplicationScope {

	private TipoTelefone[] tipos;

	public ApplicationScope() {
		tipos = TipoTelefone.values();
	}

	public TipoTelefone[] getTipos() {
		return tipos;
	}

	public void setTipos(TipoTelefone[] tipos) {
		this.tipos = tipos;
	}

}
