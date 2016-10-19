package casp1;

public enum  TipoImovel {
	CASA("Casa"),
	APARTAMENTO("Apartamento"),
	LOTE("Lote");
	
	private TipoImovel(String descricao) {
		this.descricao = descricao;
	}
	
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}

	
}