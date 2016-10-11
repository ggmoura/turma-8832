import java.util.Scanner;

public class AtividadeFor {
	public static void main(String[] args) {
		
		System.out.print("Informe a seu nome: ");
		Scanner leitor = new Scanner(System.in);
		String nome = leitor.nextLine(); 
		
		leitor.close();
		
		for(int i = 0; i < 10; i++){
			System.out.println(i + " - " + nome);
		}
	}
}
