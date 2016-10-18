package AtividadeEnum;

import java.util.Scanner;

public class TesteEnum {

		public static void main(String[] args) {
			System.out.println(DiaSemana.DOMINGO);
			System.out.println(DiaSemana.DOMINGO.getDescricao());
			System.out.println(DiaSemana.DOMINGO.getValor());
			
			DiaSemana dia = DiaSemana.SEGUNDA_FEIRA;
			
			System.out.println("Segunda feira está na ordem: " + dia.ordinal());
			
			
			if (dia == DiaSemana.SEGUNDA_FEIRA) {
				System.out.println(dia);
			}
			
			Scanner exibe = new Scanner(System.in);
			Integer opcao = null;
			
			do{
				System.out.println("Digite de 0 a 6: ");
				opcao = exibe.nextInt();
				
			switch (opcao) {
				case 0:
				System.out.println("Segunda Feira");
				break;
			case 1:
				System.out.println("Terça Feira");
				break;
			case 2:
				System.out.println("Quarta Feira");
				break;
			case 3:
				System.out.println("Quinta Feira");
				break;
			case 4:
				System.out.println("Sexta Feira");
				break;
			case 5:
				System.out.println("Sabado");
				break;
			case 6:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("Opçãoo invalida!");
				break;
			}
			
		}while (opcao!=0);
		exibe.close();		
		}
	
	}
