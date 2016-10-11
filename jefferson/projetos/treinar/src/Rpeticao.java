public class Rpeticao {

	public static void main(String[] args) {

		String mensagem = "";
		int cont = 8;
		while (cont <= 50) {

					 			 
			if (cont % 2 == 0)
				System.out.println("Par: " + cont + "\n");
			else {
				System.out.println("Impar: " + cont + "\n");
			}
			cont++;

		}
			cont = 0;
			do {
				System.out.println("Conte sera impresso...");
			} while (cont > 0);
		

	// mensagem = cont % 2 == 0 ? "e par" : "e impar";
	// System.out.println(mensagem + cont);
	// cont++;
	}
}
