import java.util.Scanner;

public class AtividadeException {

		public static void main(String[] args) {
			Integer i = null;
			Scanner leitor = new Scanner(System.in);
			System.out.print("Informe um número: ");
			
			try {
				i = leitor.nextInt();
				System.out.println("O numero informado foi: " + i);
			} catch (java.util.InputMismatchException e) {
				System.out.println("O valor digitado está incorreto.");
			}
			leitor.close();
			
		}
}
				
		


