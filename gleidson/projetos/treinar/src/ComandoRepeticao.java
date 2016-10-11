
public class ComandoRepeticao {

	
	public static void main(String[] args) {
		
		int cont = 0;
		String mensagem = "";
		
		while (cont <= 50) {
			mensagem = cont % 2 == 0 ? "eh par " : "eh impar ";
			System.out.println(mensagem + cont);
			cont++;
			
//			'
//			if (cont % 2 == 0) {
//				System.out.println("eh par "+ cont);				
//			} else {
//				System.out.println("eh impar " + cont);
//			}
//			cont++;
		}
		
		cont = 0;
		
		do {
			System.out.println("Conte serah impresso...");
		} while (cont > 0);
		
		
	}
	
}
