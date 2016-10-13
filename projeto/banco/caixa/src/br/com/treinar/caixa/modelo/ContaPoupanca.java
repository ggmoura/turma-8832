package br.com.treinar.caixa.modelo;

import br.com.treinar.caixa.modelo.banco.Conta;

public class ContaPoupanca extends Conta {

	private Integer taxaRendimento;

	public Integer getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(Integer taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
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
