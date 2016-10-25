package br.com.treinar.estudo.io;

import java.util.List;
import java.util.Scanner;

public class AtividadeLerNomes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		List<String> nomes = lerArquivo();
		for (String nome : nomes) {
			System.out.println(nome);
		}
		String nome = "";
		do {
			System.out.print("\n\nInforme o nome ou escreva [sair] para finalizar: ");
			nome = leitor.nextLine();
			if (!nome.equalsIgnoreCase("sair")) {
				nomes.add(nome);
			}
			leitor.close();
		} while (nome.equalsIgnoreCase("sair"));
		gravarArquivoOrdenado(nomes);
		System.out.println("fim do programa!");
	}
	
	
	public static List<String> lerArquivo() {
		
		
		return null;
	}
	
	public static List<String> gravarArquivoOrdenado(List<String> nomes) {
		
		
		return null;
	}
}
