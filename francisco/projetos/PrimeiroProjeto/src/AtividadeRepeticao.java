import java.util.Scanner;


public class AtividadeRepeticao {
	
	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe a quantidade de vezes que deseja imprimir na tela: ");
		int quantidade = leitor.nextInt();
		leitor.close();
      
		int cont = 0;
		        
		while (quantidade > cont) {
			System.out.println("While Quantidade informada é " + quantidade);
			cont++;
		}
		
		cont = 0;
		
		do {
			if (quantidade > 0) {
				System.out.println("Do Quantidade informada é: " + quantidade);
			}
			cont++;
		} while (quantidade > cont);
		
				
		for (int i = 0; i < quantidade; i++) { // na declaração de variavel dentro do for
			System.out.println(i + " = For - Imprimir " + quantidade + " vezes.");
		}
		
		

}
}
