package br.com.treinar.caixa.modelo;

import br.com.treinar.caixa.modelo.banco.Conta;

public class ContaPoupanca extends Conta {

	private static Integer taxaRendimento;
	private Integer diaUltimoDeposito;
	
	static {
		taxaRendimento = 0;
	}

	public Integer getTaxaRendimento() {
		return taxaRendimento;
	}

	public static void setTaxaRendimento(Integer taxaRendimento) {
		// System.out.println(diaUltimoDeposito); nao eh possivel utilizar
		// atributos de instancia em metodos estaticos
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}

	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (valor <= saldo) {
			saldo = saldo - valor;
			sacou = Boolean.TRUE;
		}
		return sacou;
	}

	public Integer getDiaUltimoDeposito() {
		return diaUltimoDeposito;
	}

	public void setDiaUltimoDeposito(Integer diaUltimoDeposito) {
		this.diaUltimoDeposito = diaUltimoDeposito;
	}

}
