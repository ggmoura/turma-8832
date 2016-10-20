

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
		
		switch (dia) {
		case DOMINGO:
			System.out.println("Dom");
			break;
		case QUARTA_FEIRA:
			System.out.println("Qua");
			break;
		case QUINTA_FEIRA:
			System.out.println("Qui");
			break;
		case SABADO:
			System.out.println("Sab");
			break;
		case SEGUNDA_FEIRA:
			System.out.println("Seg");
			break;
		case SEXTA_FEIRA:
			System.out.println("Sex");
			break;
		case TERCA_FEIRA:
			System.out.println("Ter");
			break;
		default:
			break;
		}
		
		DiaSemana[] dias = DiaSemana.values();
		
		for (DiaSemana diaSemana : dias) {
			System.out.println(diaSemana + "\t\t" + diaSemana.getDescricao() + "\t" + diaSemana.getValor());
		}
		
		String sabado = "SABADO";
		DiaSemana sabadoEnum = DiaSemana.valueOf(sabado);
		System.out.println(sabadoEnum.getDescricao());
		
	}


	
}
