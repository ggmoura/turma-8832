package br.com.treinar.agenda.dao;

public interface IBaseDAO<T> {

	void inserir(T obj);
	
	void excluir(T obj);
	
	T recuperar(Long id);
	
	void atualizar(T obj);
	
}
