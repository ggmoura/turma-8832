package br.com.treinar.caixa.modelo;

import br.com.treinar.caixa.modelo.banco.Conta;
import br.com.treinar.caixa.modelo.banco.ICaptalizavel;
import br.com.treinar.caixa.modelo.exception.SaldoInsuficienteException;

public class ContaPoupanca extends Conta implements ICaptalizavel {

	private static Integer taxaRendimento;
	private Integer diaUltimoDeposito;
	
	static {
		taxaRendimento = 0;
	}

	public static Integer getTaxaRendimento() {
		return taxaRendimento;
	}

	public static void setTaxaRendimento(Integer taxaRendimento) {
		// System.out.println(diaUltimoDeposito); nao eh possivel utilizar
		// atributos de instancia em metodos estaticos
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}

	public void sacar(Double valor) throws SaldoInsuficienteException {
		if (valor <= saldo) {
			saldo = saldo - valor;
		} else {
			throw new SaldoInsuficienteException(recuperarSaldo());
		}
	}

	public Integer getDiaUltimoDeposito() {
		return diaUltimoDeposito;
	}

	public void setDiaUltimoDeposito(Integer diaUltimoDeposito) {
		this.diaUltimoDeposito = diaUltimoDeposito;
	}

	@Override
	public void captalizar() {
		System.out.println("se passaram " + CICLO + " dias");
		saldo = saldo * taxaRendimento;
	}

}
