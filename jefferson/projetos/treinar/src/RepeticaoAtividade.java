import java.util.Scanner;

public class RepeticaoAtividade {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe a quantidade: ");
		int quantidade = leitor.nextInt();
		int cont = 0;
		
		
		 for(int i = 0; i < quantidade; i++){
		 System.out.println(i + " - Jefferson" + "\n");
		 }
		 
		 
		while (cont < quantidade) {
			System.out.println("Jefferson");
			cont++;
		}

		cont = 0;
		System.out.println("Com do ...");
		do {
			if (quantidade != 0) {
				System.out.println("Jefferson");
			}
						cont++;
			
		} while (cont < quantidade);

		leitor.close();
	}

}
