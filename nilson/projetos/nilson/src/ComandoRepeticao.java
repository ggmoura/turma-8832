public class ComandoRepeticao {
	public static void main(String[] args) {

		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		String mensagem = "";
		
		
		while (cont1 <= 50) {
			cont1++;
			if (cont1 % 2 == 0) {
				System.out.println("Numero par   : " + cont1);
			} else {
				System.out.println("Numero impar : " + cont1);
			}

 
		System.out.println("------------------------------------------------");
		cont2 = 100;
		while (cont2 <= 50) {
			cont2++;
			mensagem = cont2 % 2 == 0 ? " numero par:" : "numero impar:";
				System.out.println(mensagem + cont2);
			}
		}
	
	do {
		System.out.println("cont será impresso ....");
		} while (cont3 > 0);	
	
	
	
	
	
}
}

