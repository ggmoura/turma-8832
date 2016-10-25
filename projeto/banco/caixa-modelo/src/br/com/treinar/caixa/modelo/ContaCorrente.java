package br.com.treinar.caixa.modelo;

import br.com.treinar.caixa.modelo.banco.Conta;
import br.com.treinar.caixa.modelo.banco.ITarifavel;
import br.com.treinar.caixa.modelo.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements ITarifavel {

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
		return saldo + limiteCreditoUtilizado;
	}
	
	public void sacar(Double valor) throws SaldoInsuficienteException {
		if (valor <= (saldo + (limiteCredito - limiteCreditoUtilizado))) {
			if (valor <= saldo) {
				saldo = saldo - valor;				
			} else {
				limiteCreditoUtilizado = limiteCreditoUtilizado + (valor - saldo);
				saldo = 0d;
			}
		} else {
			SaldoInsuficienteException sie = new SaldoInsuficienteException();
			sie.setSaldoAtual(recuperarSaldo());
			throw sie;
		}
	}
	
	@Override
	public void depositar(Double valor) {
		if (limiteCreditoUtilizado > 0) {
			if (valor <= limiteCreditoUtilizado) {
				limiteCreditoUtilizado -= valor;
				valor = 0d;
			} else {
				valor -= limiteCreditoUtilizado;
				limiteCreditoUtilizado = 0d;
			}
		}
		super.depositar(valor);
	}

	@Override
	public void tarifar() {
		saldo -= taxaManutencao;
	}

}
