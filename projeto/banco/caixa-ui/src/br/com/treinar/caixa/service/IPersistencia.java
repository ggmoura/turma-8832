package br.com.treinar.caixa.service;

import br.com.treinar.caixa.modelo.banco.Conta;

public interface IPersistencia {

	void salvar(Conta conta);
	
	Conta recuperar(Integer numeroConta);
	
	void excluir(Conta conta);
	
	void alterar(Conta conta);
	
}
