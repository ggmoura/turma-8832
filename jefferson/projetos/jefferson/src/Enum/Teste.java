package Enum;

import java.util.Scanner;


public class Teste {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Integer ordinal = leitor.nextInt();
		System.out.println(DiaSemana.values()[ordinal].getDescricao());
		
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
		
		}
}
