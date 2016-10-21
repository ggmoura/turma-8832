import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AtividadeListarPelaPrimeiraLetraNome {
	
	public static void main(String[] args) {
		Map<caractere, List<String>> nomes = new HashMap<>();

		
		System.out.print("Informe o seu nome: ");
	
		Scanner leitor = new Scanner(System.in);
		String nome = null;
		Character primeiraLetra = null;
				
		do {
			System.out.println("Informe o nome: ");
			nome = leitor.nextLine();
			
			if (!nome.equalsIgnoreCase("sair")) {
				caractere = nome.charAt(0);

				System.out.println("Continue digitando.");
			}
		} while (!nome.equalsIgnoreCase("sair"));
		leitor.close();
	
		
		
		
	}
	
}
