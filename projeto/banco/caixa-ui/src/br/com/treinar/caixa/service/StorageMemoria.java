package br.com.treinar.caixa.service;

import br.com.treinar.caixa.modelo.banco.Conta;
import br.com.treinar.caixa.modelo.banco.SituacaoConta;

public class StorageMemoria implements IPersistencia {

	private Conta[] contas;
	private static StorageMemoria instance;
	private int indice = 0;
	
	private StorageMemoria() {
		super();
		contas = new Conta[20];
	}
	
	static {
		instance = new StorageMemoria();
	}
	
	public static StorageMemoria getInstance() {
		return instance;
	}
	
	
	@Override
	public void salvar(Conta conta) {
		if (indice < contas.length) {
			conta.setSituacao(SituacaoConta.ATIVA);
			this.contas[indice++] = conta;			
		}
	}

	@Override
	public Conta recuperar(Integer numeroConta) {
		Conta retornada = null;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null && contas[i].getNumeroConta().equals(numeroConta)) {
				retornada = contas[i];
				break;
			}
		}
		return retornada;
	}

	@Override
	public void excluir(Conta conta) {
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null && contas[i].getNumeroConta().equals(conta.getNumeroConta())) {
				contas[i] = null;
				break;
			}
		}
	}

	@Override
	public void alterar(Conta conta) {
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null && contas[i].getNumeroConta().equals(conta.getNumeroConta())) {
				contas[i] = conta;
				break;
			}
		}
	}
	
	public Conta[] recuperarTodas() {
		int contador = 0;
		Conta[] contasValidas = null;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				contador++;
			}
		}
		contasValidas = new Conta[contador];
		contador = 0;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				contasValidas[contador++] = contas[i];
			}
		}
		return contasValidas;
	}
	
}
