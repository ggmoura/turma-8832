package collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestMap3 {

	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nome = null;
		Character primeiraLetra = null;
		Map<Character, List<String>> nomes = new HashMap<Character, List<String>>();
		do {
			System.out.print("Informe o nome: ");
			nome = leitor.nextLine();
			if (!nome.equalsIgnoreCase("sair")) {
				primeiraLetra = nome.charAt(0);
				if (!nomes.containsKey(primeiraLetra)) {
					nomes.put(primeiraLetra, new ArrayList<String>());
				}
				nomes.get(primeiraLetra).add(nome);
			}
		} while (!nome.equalsIgnoreCase("sair"));
		
		System.out.println(nomes);
		leitor.close();
	}
	
}