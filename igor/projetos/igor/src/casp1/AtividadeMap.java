package casp1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AtividadeMap {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String nome = null;
		Character primeiraLetra = null;
		Map<Character, List<String>> cadastro = new HashMap<>();
		
		do {
			System.out.println("Informe o nome: ");
			nome = teclado.nextLine();
			
			if (!nome.equalsIgnoreCase("sair")) {
				primeiraLetra = nome.charAt(0);
				if (!cadastro.containsKey(primeiraLetra)) {
					cadastro.put(primeiraLetra, new ArrayList<>());
				}
				cadastro.get(primeiraLetra).add(nome);
			}
			teclado.close();
			
		} while (!nome.equalsIgnoreCase("Sair"));
				
		
		
	}
	
}
