public class ComandoDecicaso {

	public static void main(String[] args) {
		int a = 9;

		if (a == 1) {
			System.out.println("Igual a 1");
		} else

		if (a == 2) {
			System.out.println("Igual a 2");
		} else if (a == 3) {
			System.out.println("Igual a 3");
		} else if (a == 4) {
			System.out.println("Igual a 4");
		} else if (a == 5) {
			System.out.println("Igual a 5");
		}
		System.out.println("Fim");

			System.out.println("Com switch case...\n");
		
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
			System.out.println("Opcao invalida");
			break;
		}
	}

}
