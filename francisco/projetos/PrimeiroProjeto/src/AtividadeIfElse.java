public class AtividadeIfElse {

	public static void main(String[] args) {

		int a = 3;

		if (a == 1) {
			System.out.println(" A é igual a Um");
		} else {

			if (a == 2) {
				System.out.println(" A é igual a Dois ");
			} else {

				if (a == 3) {
					System.out.println(" A é igual a Tres ");
				} else {

					if (a == 4) {
						System.out.println(" A é igual a Quatro ");
					} else {

						if (a == 5) {
							System.out.println(" A é igual a Cinco ");
						}
					}
				}
			}
		}

		if (a == 1) {
			System.out.println(" A é igual a Um");
		} else if (a == 2) {
			System.out.println(" A é igual a Dois ");
		} else if (a == 3) {
			System.out.println(" A é igual a Tres ");
		} else if (a == 4) {
			System.out.println(" A é igual a Quatro ");
		} else if (a == 5) {
			System.out.println(" A é igual a Cinco ");
		}
		System.out.println( "\n Com switch case \n\n");
		
		switch (a) { //passar variavel de número inteiro ou string
		case 1:
			System.out.println(" A é igual a Um");
			break;
		case 2:
			System.out.println(" A é igual a Dois");
//			break;  // quando não existir o break ele vai executar todos os código até achar novo break
		case 3:
			System.out.println(" A é igual a Tres");
//			break;
		case 4:
			System.out.println(" A é igual a Quatro");
			break;
		case 5:
			System.out.println(" A é igual a Cinco");
			break;

		default:
			System.out.println(" Opção Inválida ");
			break;
		}
	}
}
