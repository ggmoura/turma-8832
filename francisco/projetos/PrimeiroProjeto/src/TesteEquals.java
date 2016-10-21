

public class TesteEquals {

	public static void main(String[] args) {
		
		Estado estado = new Estado();
		estado.nome = "São Paulo";
		estado.qtdMoradores = 100000;
		estado.sigla = "MG";
		
		Estado estado1 = new Estado();
		estado1.nome = "Minas Gerais";
		estado1.qtdMoradores = 100000;
		estado1.sigla = "MG";
		
		Estado estado2 = estado;
		
		System.out.println(estado == estado1);
		System.out.println(estado.equals(estado1));
		System.out.println(estado.equals(estado2));
		System.out.println(estado == estado2);
		
		
		
	}
	
	
}
