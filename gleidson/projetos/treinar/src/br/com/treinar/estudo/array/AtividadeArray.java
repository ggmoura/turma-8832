package br.com.treinar.estudo.array;

public class AtividadeArray {
	
	static void imprimir(String... values) {
		for (int i = 0; i < values.length; i++) {
			imprimir(values[i]);
		}
	}
	
//	static void imprimir(String[] values) {
//		for (int i = 0; i < values.length; i++) {
//			imprimir(values[i]);
//		}
//	}
	
	static void imprimir(String value) {
		System.out.println(value);
	}
	

	public static void main(String[] args) {
		String[] nomes = new String[6];
		nomes[0] = "Gleidson";
		nomes[1] = "GLieson";
		nomes[2] = "Ana Paula";
		nomes[3] = "Giovanni";
		nomes[4] = "Ana Madalena";
		nomes[5] = "Getúlio";
		
		String[] copia = new String[nomes.length];
		for (int i = 0; i < copia.length; i++) {
			copia[i] = nomes[i];
		}
		imprimir(copia);
		
		
		String[] cidades = {"Belo Horizonte", "Contagem"};
		imprimir(cidades);
		
		imprimir("Gleidson", "Isabela", "Raquel");
	}
	
}
