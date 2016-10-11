import java.util.Scanner;


public class AtividadeFor {
	public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);
	System.out.print("Digite seu nome: ");
	String nome = leitor.nextLine();
			
	for (int i = 0; i <= 10 ; i++) {
		System.out.println( i + " - " + nome);
	}
	
	leitor.close();
	
	}
}
