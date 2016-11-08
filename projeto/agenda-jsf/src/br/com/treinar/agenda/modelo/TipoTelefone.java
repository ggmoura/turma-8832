package br.com.treinar.agenda.modelo;

public enum TipoTelefone {

	CELULAR("Celular"),
	RESIDENCIAL("Residencial"),
	COMERCIAL("Comercial");
	
	private String descricao;
	
	private TipoTelefone(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
