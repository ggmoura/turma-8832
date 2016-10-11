package br.com.treinar.estudo.objeto;

public class Principal {

	public static void main(String[] args) {
		
		Cidade cidade = new Cidade();
		cidade.nome = "Belo Horizonte";
		cidade.populacao = 50000;
		
		Estado estado = new Estado();
		estado.nome = "Minas Gerais";
		estado.sigla = "MG";
		estado.qtdMoradores = 46546546;
		
		cidade.estado = new Estado();
		cidade.estado.nome = "São Paulo";
		cidade.estado.sigla = "SP";
		cidade.estado.qtdMoradores = 6546546;
		
		//estado = null;
		
		
		System.out.println(cidade.estado.nome);
		
	}
	
}
