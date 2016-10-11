import java.util.Scanner;


public class AtividadeImprimirNome {

	public static void main(String[] args) {
		
		// IMPRIMIR 10 VEZES O NOME DO USUÁRIO.

		System.out.print("Informe o seu nome: ");
		Scanner leitor = new Scanner(System.in);
		String nome = leitor.nextLine();
		leitor.close();

		
		for (int i = 0; i < 11; i++) {
			System.out.println("O seu nome é :" + nome);
		}

	}
}
