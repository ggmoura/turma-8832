package exceptions;
import java.util.Scanner;

public class TestExceptions2 {
	public static void main(String[] args) {

		try {
			Testeuser();
		} catch (Exception e) {
			System.out.println(" Numero ARRAY invalido! Estouro de ARRAY !!!!");
		}
	}
	
	private static void Testeuser() {
		int totarray;
		int numarray;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o length para o ARRAY: ");
		totarray = leitor.nextInt();
		leitor.nextLine();

		String[] teste = new String[totarray];
		for (int i = 0; i < teste.length; i++) {
			System.out.print("Digite um nome para o Array teste[" + i + "]: ");
			teste[i] = leitor.nextLine();
		}

		System.out.print("Digite uma posição do Array para display: ");
		numarray = leitor.nextInt();
		System.out.println(teste[numarray]);
		leitor.close();
	}
}