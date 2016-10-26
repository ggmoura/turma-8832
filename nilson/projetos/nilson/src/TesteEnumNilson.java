import java.util.Scanner;


public class TesteEnumNilson {
	
	public enum DiaSemana {

		SEGUNDA_FEIRA("Segunda Feira", "0"),
		TERCA_FEIRA("Terça Feira", "1"),
		QUARTA_FEIRA("Quarta Feira", "2"),
		QUINTA_FEIRA("Quinta Feira", "3"),
		SEXTA_FEIRA("Sexta Feira", "4"),
		SABADO("Sábado", "5"),
		DOMINGO("Domingo", "6");
		
		private DiaSemana(String descricao, String valor) {
			this.descricao = descricao;
			this.valor = valor;
		}
		
		private String descricao;
		private String valor;
		
		public String getDescricao() {
			return descricao;
		}
		public String getValor() {
			return valor;
		}
	
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int numdia;
		
		System.out.print("Digite um numero : ");
		numdia = leitor.nextInt();
		leitor.close();

		Integer ordinal = numdia;

		DiaSemana[] diasSemana = DiaSemana.values();
		DiaSemana diaSemana = diasSemana[ordinal];
		System.out.println(diaSemana.getDescricao());
	
	}

  }
	
}	
