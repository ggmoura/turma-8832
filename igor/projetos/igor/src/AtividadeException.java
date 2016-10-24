import java.util.Scanner;

public class AtividadeException {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			Integer i = trataNumerico();
			System.out.println(i);
		} catch (Exception e) {
			System.out.println("deu merda");
		}
		System.out.println("FIM de programa");
		teclado.close();
	}

	public static Integer trataNumerico() throws Exception {
		Integer i = teclado.nextInt();
		return i;
	}
}
