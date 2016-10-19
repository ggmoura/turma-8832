package br.com.treinar.caixa.modelo;

import br.com.treinar.caixa.modelo.banco.Conta;

public class ContaSalario extends Conta {

	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (valor <= saldo) {
			saldo = saldo - valor;
			sacou = Boolean.TRUE;
		}
		return sacou;
	}
	
}
