package br.com.treinar.estudo.dominiodiscreto;

import java.util.Scanner;

public class AtividadeEnumAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o ordinal do dia: ");
		Integer ordinal = sc.nextInt();
		sc.close();
		DiaSemana dia = null;
		switch (ordinal) {
		case 0:
			dia = DiaSemana.SEGUNDA_FEIRA;
			break;
		case 1:
			dia = DiaSemana.TERCA_FEIRA;
			break;
		case 2:
			dia = DiaSemana.QUARTA_FEIRA;
			break;
		case 3:
			dia = DiaSemana.QUINTA_FEIRA;
			break;
		case 4:
			dia = DiaSemana.SEXTA_FEIRA;
			break;
		case 5:
			dia = DiaSemana.SABADO;
			break;
		case 6:
			dia = DiaSemana.DOMINGO;
			break;

		default:
			break;
		}
		
		System.out.println(dia.getDescricao());
		
	}
	
}
