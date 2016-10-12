public class AtividadeIf0710 {

	public static void main(String[] args) {

		int num = 3;

		if (num == 1) {
			System.out.println("Número é um");
		} else if (num == 2) {
			System.out.println("Numero é dois");
		} else if (num == 3) {
			System.out.println("Número é três");
		} else if (num == 4) {
			System.out.println("Número é quatro");
		} else if (num == 5) {
			System.out.println("Numero é quatro");
		} else {
			System.out.println("Número nao e um, nem dois, nem tres, nem quatro nem cinco.");
		}
		
		
		System.out.println("\nMesmo cenário com switch case abaixo...\n");
		
		//Mesmo cenário com switch case
		switch (num) {
		case 1:
			System.out.println("Um");
			break;
		case 2:
			System.out.println("Dois");
			break;
		case 3:
			System.out.println("Tres");
			break;
		case 4:
			System.out.println("Quatro");
			//break; //Nesse cenário quando não tem o break executará os casos sequentes até encontrar um break
		case 5:
			System.out.println("Cinco");			
			break;
		default:
			System.out.println("Nenhuma opção valida");
			break;
		}
	}
	
}


	