
public class ComandoRepeticao {

	public static void main(String[] args) {
		
		int cont = 0;
		
		while (cont <= 10 ) {
			System.out.println(cont++);

			
		}
		
		cont = 0;
		
		while (cont <=50) {
			System.out.println(cont);
			cont = cont + 2;
		}
		
		cont = 0;
		
		while (cont <=50) {
			System.out.println(cont += 2);

		}
		
		cont = 0;
		
		while (cont <=50) {
			if (cont % 2 == 0 ) {
				System.out.println("eh par " + cont);
			} else {
				System.out.println("eh impar " + cont );
			}
			cont++;
		}
		
		cont = 0;
		String mensagem = "";

		while (cont <= 50) {
			mensagem = cont % 2 == 0 ? "eh par " : "eh impar ";
			System.out.println(mensagem + cont);
			cont++;
			
		}
		
		cont = 0;
		do { // Utilizar o do while sempre que precisar passar pela condição pelo menos uma vez
			System.out.println("\nConte será impresso");
		} while (cont > 0);
 	}
}
