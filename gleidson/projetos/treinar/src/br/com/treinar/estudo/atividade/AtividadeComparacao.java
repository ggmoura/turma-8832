package br.com.treinar.estudo.atividade;

import br.com.treinar.estudo.Pessoa;

public class AtividadeComparacao {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Gleidson";
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Gleidson";
		
		System.out.println(pessoa);
		System.out.println(pessoa2);
		
		System.out.println(pessoa == pessoa2);
		
		pessoa = pessoa2;
		
		System.out.println(pessoa);
		System.out.println(pessoa2);
		
		System.out.println(pessoa == pessoa2);

	}
	
}
