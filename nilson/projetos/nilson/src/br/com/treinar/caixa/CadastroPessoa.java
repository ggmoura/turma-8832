package br.com.treinar.caixa;

public class CadastroPessoa {
	
	public static void main(String[] args) {
		
		Pessoa novaPessoa = new Pessoa();
		
		novaPessoa.nomePessoa   = "Nilson Cota";
		novaPessoa.idade        = 18;
	
		Pessoa novaPessoa2 = new Pessoa();
		
		//novaPessoa2 = novaPessoa;
		
		novaPessoa2.nomePessoa   = "Juca Salasino";
		novaPessoa2.idade        = 50;

		System.out.println(novaPessoa.nomePessoa);
		System.out.println(novaPessoa.idade);
		System.out.println("----------------------------------");
		System.out.println(novaPessoa2.nomePessoa);
		System.out.println(novaPessoa2.idade);
		
//		novaPessoa2.nomePessoa = novaPessoa.nomePessoa;
//		novaPessoa2.idade = novaPessoa.idade;
//
//		System.out.println("----------------------------------");
//		System.out.println(novaPessoa2.nomePessoa);
//		System.out.println(novaPessoa2.idade);
//
//		novaPessoa.nomePessoa   = "Juca Salasino";
//		novaPessoa.idade        = 55;
		
//		System.out.println("----------------------------------");
//		System.out.println(novaPessoa2.nomePessoa);
//		System.out.println(novaPessoa2.idade);
		
	}
	
}
