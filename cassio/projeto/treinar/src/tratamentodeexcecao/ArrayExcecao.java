package tratamentodeexcecao;

import java.util.Scanner;

public class ArrayExcecao {

	public static void main(String[] args) {
		
		String[] alunos = new String[5];
		alunos[0] = "Maria";
		alunos[1] = "João";
		alunos[2] = "Marta";
		alunos[3] = "Luiz";
		alunos[4] = "Marcos";
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe um nome para a posição 5: ");
		leitor.nextLine();
		
		try {
			alunos[5] = "José";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição não existe " +e.getMessage());
		}finally {
			leitor.close();
		}
	}
}
