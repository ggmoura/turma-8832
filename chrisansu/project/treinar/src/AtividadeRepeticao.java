import java.util.Scanner;

public class AtividadeRepeticao {

	public static void idade(){
		System.out.println("Informe a sua idade:");//pedindo para informar a idade
		Scanner leitor = new Scanner(System.in); //pego o que for digitado
		int quantidade = leitor.nextInt(); //retorno do digito informado
		int vezes = 0;//parte inicinal

		do {
			vezes++;
			if (quantidade > 0) {
				System.out.println("Idade informada do:" + quantidade);
			} else {
				idade(); //se nao for informado a idade, o sistema repete a pergunta
			}
		} while (vezes < quantidade);
		leitor.close();
	}

	public static void main(String[] args) {

		// /int vezes = 0;
		/*
		 * while(vezes < quantidade){ vezes++;
		 * System.out.println("Idade informada while:" + quantidade); }
		 */

		//idade();
		
		int idade = 7;
		
		for(int i = 0; i < idade; i++){
			System.out.println("indice: " + i);
		}

	}
}
