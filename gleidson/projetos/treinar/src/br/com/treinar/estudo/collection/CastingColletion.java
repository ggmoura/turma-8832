package br.com.treinar.estudo.collection;

import java.util.ArrayList;
import java.util.List;

import br.com.treinar.estudo.Pessoa;

public class CastingColletion {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa(22, "Gleison");
		Pessoa pessoa1 = new Pessoa(11, "Nathalia");
		Pessoa pessoa2 = new Pessoa(9, "Amanda");
		Pessoa pessoa3 = new Pessoa(58, "Getúlio");
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(pessoa);
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
//		pessoas.add("");
		
		for (Pessoa p : pessoas) {
			System.out.print(p.nome);
			System.out.print(" - " + p.idade);
			System.out.println();
		}
		
		
	}
	
}
