package Modelo;

public class Produto {

	private Integer valorProduto;
	private String nome;
	private Integer qt;
	private Integer quantidade;
	private Integer compra;
	

	public Integer getCompra() {
		return compra;
	}
	public void setCompra(Integer compra) {
		this.compra = compra * getValorProduto();
	}
	public Produto() {
		quantidade = 0;
	}
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(Integer valorProduto) {
		this.valorProduto = valorProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQt() {
		return qt;
	}

	public void setQt(Integer qt) {
		this.qt = qt;
	}

	public void Comprar() {
		Integer quantidade;

	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Produto [valorProduto=" + valorProduto + ", nome=" + nome
				+ ", qt=" + qt + ", quantidade=" + quantidade + ", compra="
				+ compra + "]";
	}
	
	
	
	}