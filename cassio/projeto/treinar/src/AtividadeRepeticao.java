import java.util.Scanner;

public class AtividadeRepeticao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite a quantidade de vezes que deseja imprimir seu nome:");
		int quantidade = leitor.nextInt();
		// System.out.println(quantidade);
	/*	int i = 1;
		
		//comando while
		while (i <= quantidade) {
			System.out.println("Cássio");
			i++;
		}
		i = 1;
		System.out.println("Com do..");
		
		//comando do...while
		do {
			if (quantidade >= i) {
				System.out.println("Cássio");
				i++;
			}
		} while (i <= quantidade);
		*/
		
		//comando for
		for (int i = 0; i < quantidade; i++) { //podem ser declaradas várias variáveis além do i, todas do mesmo tipo
			System.out.println(i + " - Cássio");
		}
		leitor.close(); // nada mais vai ser lido no teclado
	}
}
