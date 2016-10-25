import java.util.Scanner;

public class AtividadeExceptionArray {
	
	public static void main(String[] args) {
		
		Integer i = null;
		String[] nomes = null;
		
		nomes = new String[10];
		
		nomes[0] = "Raul";
		nomes[1] = "Gleidson";
		nomes[2] = "Maria Sophia";
		nomes[3] = "Davi Lucas";
		nomes[4] = "Juan Pablo";
		nomes[5] = "João Carlos";
		nomes[6] = "Nathalia";
		nomes[7] = "Amanda";
		nomes[8] = "Miguel";
		nomes[9] = "Isis";

		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe a posição a imprimir do Arry: ");
		
		try {
			i = leitor.nextInt();
			System.out.println(nomes[i]);
		} catch (Exception e) {
			System.out.println("Posição de arry inválido!");
		} finally {
			leitor.close();
		}

	}

}
