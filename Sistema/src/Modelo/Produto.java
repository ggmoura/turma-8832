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
	}