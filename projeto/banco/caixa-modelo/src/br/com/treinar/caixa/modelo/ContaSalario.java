package br.com.treinar.caixa.modelo;

import br.com.treinar.caixa.modelo.banco.Conta;
import br.com.treinar.caixa.modelo.exception.SaldoInsuficienteException;

public class ContaSalario extends Conta {

	public void sacar(Double valor) throws SaldoInsuficienteException {
		if (valor <= saldo) {
			saldo = saldo - valor;
		} else {
			throw new SaldoInsuficienteException(recuperarSaldo());
		}
	}
	
}
