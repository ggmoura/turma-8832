package br.com.treinar.caixa;

public class TesteComparacao {
	
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		pessoa1.nomePessoa = "Nilson cota";
		pessoa2.nomePessoa = "Nilson cota";

		System.out.println("Comparação 1: " + (pessoa1.nomePessoa == pessoa2.nomePessoa));
		System.out.println("Comparação 1: " + (pessoa1 == pessoa2));
		System.out.println(pessoa1);
		System.out.println(pessoa2);

		pessoa1 = pessoa2;
		
		System.out.println("Comparação 1: " + (pessoa1.nomePessoa == pessoa2.nomePessoa));
		System.out.println("Comparação 1: " + (pessoa1 == pessoa2));
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		
		
				
		
	}

}
