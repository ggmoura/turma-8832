import java.util.Scanner;

public class AtividadeNome {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe o nome desejado: ");
		String nome = leitor.nextLine();

		for (int i = 0; i < 10; i++) {
			System.out.println(nome);
		}
		leitor.close();
	}
}