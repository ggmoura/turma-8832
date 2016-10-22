package br.com.treinar.estudo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.treinar.estudo.Pessoa;

public class OrdenaColecao {

	public static void main(String[] args) {
		String[] nomesStatic = {"Gleidson", "Isabela", "Maria Sophia", "Ana Paula"};
		
		List<String> nomes = Arrays.asList(nomesStatic);
		
		Collections.sort(nomes);
		
		System.out.println(nomes);
		
		Pessoa pessoa = new Pessoa(22, "Gleison");
		Pessoa pessoa1 = new Pessoa(11, "Nathalia");
		Pessoa pessoa2 = new Pessoa(9, "Amanda");
		Pessoa pessoa3 = new Pessoa(58, "Getúlio");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa);
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		System.out.println(pessoas);
		Collections.sort(pessoas);
		System.out.println(pessoas);
//		ComparadorIdade comparador = new ComparadorIdade();
//		Collections.sort(pessoas, comparador);
		
		Collections.sort(pessoas, new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.idade.compareTo(o2.idade);
			}
		});
		
		System.out.println(pessoas);
		
		
	}
	
}
