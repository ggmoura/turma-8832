

public enum DiaSemana {

	SEGUNDA_FEIRA("Segunda Feira", "Seg"),
	TERCA_FEIRA("Terça Feira", "Ter"),
	QUARTA_FEIRA("Quarta Feira", "Qua"),
	QUINTA_FEIRA("Quinta Feira", "Qui"),
	SEXTA_FEIRA("Sexta Feira", "Sex"),
	SABADO("Sábado", "Sab"),
	DOMINGO("Domingo", "Dom");
	
	private DiaSemana(String descricao, String valor) {
		this.descricao = descricao;
		this.valor = valor;
	}
	
	private String descricao;
	private String valor;
	
	public String getDescricao() {
		return descricao;
	}
	public String getValor() {
		return valor;
	}
	
	
	
}
