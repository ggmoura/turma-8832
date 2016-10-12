package br.com.treinar.estudo.objeto;

import java.util.Scanner;

public class TesteMetodo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Integer i = null;
		Integer qtdPassos = null;
		Pessoa pessoa = new Pessoa();
		pessoa.qtdPassosPercorrida = 0;
		pessoa.nome = "Gleidson";
		pessoa.estaAndando = Boolean.FALSE;
		System.out.println("O " + pessoa.nome + " está andando? " + (pessoa.estaAndando ? "Sim" : "Não"));		
		pessoa.andar();
		System.out.println("O " + pessoa.nome + " está andando? " + (pessoa.estaAndando ? "Sim" : "Não"));
		Integer alturaPulada = pessoa.pular();
		System.out.println("Parabéns " + pessoa.nome + " você pulou " + alturaPulada + " centimetros");
		String nomeInvertido = pessoa.inverterNome();
		System.out.println("Nome invertido: " + nomeInvertido);

		do {
			System.out.println("Digite 1 para andar e 0 para finalizar");
			i = leitor.nextInt();
			if (i != 0) {
				System.out.print("Informe a quantidade de passos: ");
				qtdPassos = leitor.nextInt();
				pessoa.andar(qtdPassos);
			}
		} while (i != 0);
		leitor.close();
		System.out.println("A pessoa jah percorreu: " + pessoa.qtdPassosPercorrida);
		
		pessoa.andar(10, false);
		
		
	}
	
}
