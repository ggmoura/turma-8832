package exceptions;
import java.util.Scanner;

public class TestExceptions1 {
	public static void main(String[] args) {

		try {
			Testeuser();
		} catch (Exception e) {
			System.out.println(" Numero invalido! Digite apenas um numero inteiro !!!!");
		}
	}
	
	public static void Testeuser() {
		Integer num = null;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite um numero inteiro: ");
		num = leitor.nextInt();
		leitor.close();
		System.out.println(" ---> FIM NORMAL DO PROGRAMA !!!!");
	}
}
