
public class ComandoRepeticao {

	public static void main(String[] args) {
		
		//imprime de 1 a 10
		/*
		 int num = 0;
		
		while (num < 10) {
			System.out.println(num);
			num++;
			//++cont;
		}
		*/
		
		/*
		//imprime os pares e impares de 0 a 50
		int num2 = 0;
		while (num2 <= 50) {
			if (num2 % 2 == 0 ) {
				System.out.println("eh par "+num2);
			} else {
				System.out.println("eh impar "+num2);
			}
			num2++;
		}
		*/
		
		//usar if ternário
		
		int cont = 100;
		String mensagem = "";
		
		while (cont <= 50) {
		mensagem = cont % 2 == 0 ? "eh par" : "eh impar"; 	
		System.out.println(mensagem + cont);
		cont++;
		}
		
		//Do.. While
		cont = 0;
		
		do {
			System.out.println("Conte serah impresso...");
		} while (cont > 0);
		
	}
}
