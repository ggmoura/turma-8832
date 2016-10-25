package tratamentodeexcecao;

import java.util.Scanner;

public class ExercicioExcecao {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe um número válido: ");
		
		try {
			Integer num = leitor.nextInt();
			System.out.print("\nO número informado foi: "+num);
		} catch (Exception e) {
			System.out.print("\nO número digitado é inválido!");
		}
		leitor.close();
		
	}
}
