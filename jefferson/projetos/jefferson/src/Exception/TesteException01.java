package Exception;

import java.util.Scanner;

public class TesteException01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Integer n = null;

		System.out.print("Informe um valor inteiro: ");

		try {
			n = leitor.nextInt();
			System.out.println("O numero digitado foi :" + n);
		} catch (Exception e) {
			System.out.println("Numero digitado e invalido");
		}
		leitor.close();
	}

}
