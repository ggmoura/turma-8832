package Exception;

import java.util.Scanner;

public class ArrayException {
	public static void main(String[] args) {
		String[] num = new String[3];
		Scanner leitor = new Scanner(System.in);
		
		try {
			System.out.print("Informe o nome: ");
			int indice = leitor.nextInt();
			num [indice] = "Jefferson";
			System.out.println("Numero: " + num[2]);
			leitor.close();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array fora do índice: "+e.getMessage());
		}
		
	}
}
