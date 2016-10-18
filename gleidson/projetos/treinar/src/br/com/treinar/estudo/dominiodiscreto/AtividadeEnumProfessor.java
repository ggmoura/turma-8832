package br.com.treinar.estudo.dominiodiscreto;

import java.util.Scanner;

public class AtividadeEnumProfessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o ordinal do dia: ");
		Integer ordinal = sc.nextInt();
		sc.close();
		DiaSemana[] diasSemana = DiaSemana.values();
		DiaSemana diaSemana = diasSemana[ordinal];
		System.out.println(diaSemana.getDescricao());
		
	}
	
}
