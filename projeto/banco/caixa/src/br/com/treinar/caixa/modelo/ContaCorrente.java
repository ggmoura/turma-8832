package br.com.treinar.caixa.modelo;

import br.com.treinar.caixa.modelo.banco.Conta;

public class ContaCorrente extends Conta {

	private Double limiteCreditoUtilizado;
	private Double limiteCredito;
	private Double taxaManutencao;

	public ContaCorrente() {
		super();
		limiteCredito = 0d;
		limiteCreditoUtilizado = 0d;
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public Double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(Double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}
	
	public Double recuperarSaldo() {
		return saldo + limiteCredito;
	}
	
	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (valor <= (saldo + (limiteCredito - limiteCreditoUtilizado))) {
			if (valor <= saldo) {
				saldo = saldo - valor;				
			} else {
				limiteCreditoUtilizado = limiteCreditoUtilizado - (valor - saldo);
				saldo = 0d;
			}
			
			sacou = Boolean.TRUE;
		}
		return sacou;
	}
	
	@Override
	public void depositar(Double valor) {
		if (limiteCreditoUtilizado > 0) {
			if (valor >= limiteCreditoUtilizado) {
				valor -= limiteCreditoUtilizado;
				limiteCreditoUtilizado = 0d;
			}
		}
		super.depositar(valor);
	}

}
