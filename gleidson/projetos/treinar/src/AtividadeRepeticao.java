import java.util.Scanner;


public class AtividadeRepeticao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe a quantidade: ");
		int quantidade = leitor.nextInt();
		leitor.nextLine();
		
		for(int i = 0; i < quantidade; i++) {
			System.out.println(i + " - Gleidson Moura");
		}
		System.out.print("Informe o nome: ");
		String nome = leitor.nextLine();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(nome);
		}
		
		leitor.close();
		
	}
	
}
