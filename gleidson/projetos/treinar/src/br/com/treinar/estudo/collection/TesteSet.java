package br.com.treinar.estudo.collection;

import java.util.HashSet;
import java.util.Set;

import br.com.treinar.estudo.Pessoa;

public class TesteSet {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Sophia";
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Sophia";
		
		Set<Pessoa> pessoas = new HashSet<>();
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		
		System.out.println(pessoas);
		
	}
	
}
