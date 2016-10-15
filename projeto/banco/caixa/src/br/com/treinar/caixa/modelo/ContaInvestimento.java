package br.com.treinar.caixa.modelo;

import br.com.treinar.caixa.modelo.banco.Conta;
import br.com.treinar.caixa.modelo.banco.ICaptalizavel;
import br.com.treinar.caixa.modelo.banco.ITarifavel;

public class ContaInvestimento extends Conta implements ITarifavel, ICaptalizavel {

	private Double taxaRendimento;
	private Double taxaManutencao;

	public Double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(Double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	public Double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(Double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (valor <= saldo + 10) {
			saldo = saldo - valor;
			sacou = Boolean.TRUE;
		}
		return sacou;
	}

	@Override
	public void captalizar() {
		saldo = saldo * taxaRendimento;
	}

	@Override
	public void tarifar() {
		saldo -= taxaManutencao;
	}
	
}
