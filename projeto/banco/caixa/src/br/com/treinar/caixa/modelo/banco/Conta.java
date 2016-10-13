package br.com.treinar.caixa.modelo.banco;

import br.com.treinar.caixa.modelo.Pessoa;

public abstract class Conta {

	private Integer numeroConta;
	private Integer agencia;
	protected Double saldo;
	private Pessoa pessoa;


	public Conta() {
		saldo = 0d;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public void depositar(Double valor) {
		saldo += valor;
	}

	public Double recuperarSaldo() {
		return saldo;
	}

	public abstract Boolean sacar(Double valor);
	
}
