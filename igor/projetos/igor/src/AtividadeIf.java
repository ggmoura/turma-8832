
public class AtividadeIf {

	public static void main(String[] args) {

		int a = 5;

		if (a == 1) {
			System.out.println("Um");
		} else if (a == 2) {
			System.out.println("dois");
		} else if (a == 3) {
			System.out.println("tres");
		} else if (a == 4) {
			System.out.println("quatro");
		} else if (a == 5) {
			System.out.println("cinco");
		} else {
			System.out.println("outro numero ");
		}
		// switch case só funciona para numeros inteiros ou char string
		switch (a) {
		case 1:
			System.out.println("numero um");
			break; // caso retire o brake os proximos comandos serao executados até encontra o proximo break
		case 2:
			System.out.println("numero dois");
			break;
		case 3:
			System.out.println("numero tres");
			break;
		case 4:
			System.out.println("numero quatro");
			break;
		case 5:
			System.out.println("numero cinco");
			break;
		default:
			System.out.println("opcao invalida");
			break;
		}
	}
}
