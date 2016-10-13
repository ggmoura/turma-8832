public class ComandoDecision {
	public static void main(String[] args) {

		int a = 1, b = 6;
		
		System.out.println("-------- COMANDOS DECISION --------\n");
		System.out.println("\n-> IF ELSE\n");		
		if (a == 1) {
			System.out.println("Número = 1");
		} else if (a == 2) {
			System.out.println("Número = 2");
		} else if (a == 3) {
			System.out.println("Número = 3");
		} else if (a == 4) {
			System.out.println("Número = 4");
		} else if (a == 5) {
			System.out.println("Número = 5");
		} else {
			System.out.println("Não digitado numero de 1 a 5");
		}
		
		System.out.println("\n-> SWITCH CASE\n");		
		
		switch (b) {
		case 1:
			System.out.println("Case = 1");			
			break;
		case 2:
			System.out.println("Case = 2");			
			break;
		case 3:
			System.out.println("Case = 3");			
			break;
		case 4:
			System.out.println("Case = 4");			
			break;
		case 5:
			System.out.println("Case = 5");			
			break;
		default:
			System.out.println("Switch - caso - Numero fora do intervalo");
			break;
		}
		
		
		
	}
}