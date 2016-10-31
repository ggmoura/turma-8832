package br.com.treinar.agenda.dao;

import java.util.List;

import br.com.treinar.agenda.modelo.Pessoa;

public interface IBaseDAO<T> {

	void inserir(T obj);
	
	void excluir(T obj);
	
	T recuperar(Long id);
	
	void atualizar(T obj);

	List<Pessoa> listarTodos();
	
}
