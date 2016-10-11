public class ComandoDecision {

	public static void main(String[] args) {

		int a = 9;

		if (a == 1) {
			System.out.println("um");
		} else if (a == 2) {
			System.out.println("dois");
		} else if (a == 3) {
			System.out.println("tres");
		} else if (a == 4) {
			System.out.println("quatro");
		} else {
			System.out.println("cinco");
		}

		System.out.println("\ncom switch case...\n");
		
		switch (a) {
		case 1:
			System.out.println("Um");
			break;
		case 2:
			System.out.println("Dois");
			//break;
		case 3:
			System.out.println("Tres");
			//break;
		case 4:
			System.out.println("Quatro");
			break;
		case 5:
			System.out.println("Cinco");
			break;
		default:
			System.out.println("Opção Inválida");
			break;
		}
		
		
		
		System.out.println("fim...");
	}

}
