import java.util.Scanner;

public class AtividadeRepeticao {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de vezes que voce deseja que seu nome seja impresso: ");
		int quantidade = leitor.nextInt();
		leitor.nextLine();
		System.out.print("Informe nome a ser impresso: ");
		String nome = leitor.next();
		int contador = 0;
		do {
			contador++; 
			if (quantidade > 0) {
				System.out.println(contador + nome);
			}
		} while (quantidade > contador);
		
		System.out.println("------While----------");
		
		contador = 0;
		while (quantidade > contador) {
			contador++; 
			System.out.println(contador + nome);
		}

		for (int i = 0; i < quantidade; i++) {
			System.out.println("nome: " + nome);
		}
		
		
		leitor.close();
	}

}
