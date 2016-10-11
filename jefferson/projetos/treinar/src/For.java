import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe idade: ");
		int idade = leitor.nextInt();
		leitor.nextLine();


			
		System.out.print("Informe o nome: ");
		String nome = leitor.nextLine();
		leitor.close();

		for (int i = 1; i < 11; i++) {
			System.out.println(i + ". " + nome);

		}
	}
}