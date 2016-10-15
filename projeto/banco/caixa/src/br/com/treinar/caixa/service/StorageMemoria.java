package br.com.treinar.caixa.service;

import br.com.treinar.caixa.modelo.banco.Conta;

public class StorageMemoria implements IPersistencia {

	private Conta conta;
	
	@Override
	public void salvar(Conta conta) {
		this.conta = conta;
	}

	@Override
	public Conta recuperar(Integer numeroConta) {
		Conta retornada = null;
		if (conta.getNumeroConta().equals(numeroConta)) {
			retornada = conta;
		}
		return retornada;
	}

	@Override
	public void excluir(Conta conta) {
		conta = null;
	}

	@Override
	public void alterar(Conta conta) {
		this.conta.setAgencia(conta.getAgencia());
		this.conta.setPessoa(conta.getPessoa());
	}

}
