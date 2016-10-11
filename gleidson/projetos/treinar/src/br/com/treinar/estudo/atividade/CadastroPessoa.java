package br.com.treinar.estudo.atividade;

public class CadastroPessoa {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.nome = "Gleidson";
		p.idade = 36;
		
		Pessoa funcionario = p;
		p.idade = 8;
		
		System.out.println(funcionario.nome);
		System.out.println(p.nome);
		System.out.println(funcionario.idade);
		
		funcionario.nome = "João Carlos";
		
		System.out.println(p.nome);
		
		p = new Pessoa();
		p.nome = "Michelle";
		
		System.out.println(funcionario.nome);
		
	}
	
}
