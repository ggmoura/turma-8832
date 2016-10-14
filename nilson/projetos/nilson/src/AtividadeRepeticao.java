import java.util.Scanner;

public class AtividadeRepeticao {
	public static void main(String[] args) {
		
		int cont = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite quantas vezes vc quer imprimir seu nome :");
		
		int quantidade = leitor.nextInt();
				
		System.out.println("\n -- Repetição While");
		while (cont < quantidade) {
			cont++;
			System.out.println(cont + " Nilson");
		}

		System.out.println("\n -- Repetição Do While");
		cont = 0;
		do {
			cont++;
			if (quantidade > 0) {
				System.out.println(cont + " Nilson");
			} else {
				cont = quantidade;
			}
		} while (cont < quantidade);
		
		System.out.println("\n -- Repetição FOR --");
		for (int i = 1; i < quantidade + 1; i++) {
			System.out.println(i + " Nilson");
			
		}

		System.out.println("Quantidade digitada=" + quantidade);
		
		
		System.out.println("\n -- Repetição fixa 10 x");
		System.out.print("Digite um nome :");

		leitor.nextLine();
		String nome = leitor.nextLine();
		for (int i = 1; i < 10 ; i++) {
			System.out.println("nome digitado : " + nome);
			
		}
		
		
		
		leitor.close();

	}
}
