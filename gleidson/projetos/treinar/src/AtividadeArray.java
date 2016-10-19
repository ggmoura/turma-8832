import java.util.Scanner;

public class AtividadeArray {

	static void imprime(String mensagem, String... value) {

		// criar aqui um metodo para imprimir

		for (int i = 0; i < value.length; i++) {
			System.out.println(mensagem.replace("index", Integer.toString(i)) + value[i]);
		}
	}

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int totarray;
		
		System.out.print("Digite o length para o ARRAY: ");
		totarray = leitor.nextInt();
		leitor.nextLine();
		
		String[] teste = new String[totarray];

		for (int i = 0; i < teste.length; i++) {

			System.out.print("Digite um nome para o Array teste[" + i + "]: ");
			teste[i] = leitor.nextLine();
		}
		
		leitor.close();
		
		imprime("conteudo do Array teste[index]: ", teste );

		String[] newteste = new String[totarray];

		for (int i = 0; i < newteste.length; i++) {
			newteste[i] = teste[i];
		}

		imprime( "Conteudo do novo Array newteste[index]: ", newteste);

	}

}
