package Comparacao;

import javax.swing.JFormattedTextField;

public class TesteComparacao {
	public static void main(String[] args) {

		Carro carro = new Carro();
		carro.nome = "Punto";
		carro.cor = "Preto";
		
		Carro carro1 = new Carro();
		carro1.nome = "Punto";
		carro.cor = "Preto";
		
	
		System.out.println(carro.nome == carro1.nome);
		System.out.println(carro.equals(carro1));
		System.out.println(carro);
	}


}