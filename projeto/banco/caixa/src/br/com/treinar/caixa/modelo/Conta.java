package br.com.treinar.caixa.modelo;

public class Conta {

	public Integer numeroConta;
	public Integer agencia;
	public Double saldo;
	public Pessoa pessoa;
	
	public Conta() {
		saldo = 0d;
	}
	
	public void depositar(Double valor) {
		saldo += valor;
	}
	
	
	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (valor <= saldo) {
			saldo = saldo - valor;
			sacou = Boolean.TRUE;
		}
		return sacou;
		
	}
	
}
