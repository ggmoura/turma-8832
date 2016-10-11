import java.util.Scanner;


public class AtividadeFor {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in); //criação da variavel leitor do tipo scanner
		System.out.println("Informe seu nome: ");
		String nome = leitor.nextLine(); //nome recebe o valor da variavel leitor informado no teclado
		
		//int quantidade = leitor.nextInt(); //lendo uma variável do tipo inteiro
		//leitor.nextLine();//descartar o enter após a variavel quantidade
		leitor.close();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(nome);
		}
	}
}
