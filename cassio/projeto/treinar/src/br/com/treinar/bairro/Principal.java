package br.com.treinar.bairro;

public class Principal {

	public static void main(String[] args) {
		
		Bairro novoBairro = new Bairro(); //instanciando um novo objeto do tipo bairro
		novoBairro.nome = "bairro1"; // setando o valor do atributo
		
		novoBairro.cidade = new Cidade(); //instanciando o objeto cidade que esta contido em bairro. a partir daqui e possivel caminhar dentro de cidade
		
		novoBairro.cidade.area = 52; //setando a area do objeto cidade como 52
		
		System.out.println(novoBairro.cidade.area); // imprimindo a area
		
	}
}
