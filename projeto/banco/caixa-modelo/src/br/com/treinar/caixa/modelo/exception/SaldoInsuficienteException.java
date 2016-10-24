package br.com.treinar.caixa.modelo.exception;

public class SaldoInsuficienteException extends Exception {

	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException() {
		super();
	}
	
	public SaldoInsuficienteException(Double saldoAtual) {
		this();
		this.saldoAtual = saldoAtual;
	}

	private Double saldoAtual;

	public Double getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(Double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

}
