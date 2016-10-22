package br.com.treinar.estudo.collection;

import java.util.Comparator;

import br.com.treinar.estudo.Pessoa;

public class ComparadorIdade implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		return o1.idade.compareTo(o2.idade);
	}

}
