package tratamentodeexcecao;

import java.util.Scanner;

public class ExercicioExcecao {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe um n�mero v�lido: ");
		
		try {
			Integer num = leitor.nextInt();
			System.out.print("\nO n�mero informado foi: "+num);
		} catch (Exception e) {
			System.out.print("\nO n�mero digitado � inv�lido!");
		}
		leitor.close();
		
	}
}
