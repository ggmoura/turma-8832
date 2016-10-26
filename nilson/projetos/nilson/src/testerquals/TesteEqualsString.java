package testerquals;

public class TesteEqualsString {
	
	public static void main(String[] args) {
		
		Carro novocarro  = new Carro();
		Carro novocarro2 = new Carro();

		novocarro.cor     = "Azul";
		novocarro.marca   = "Fiat";
		novocarro.modelo  = "Palio";
		novocarro2.cor    = "Azul";
		novocarro2.marca  = "Fiat";
		novocarro2.modelo = "Palio";
		
		System.out.println(novocarro);
		System.out.println(novocarro2);
		System.out.println(novocarro.equals(novocarro2));
		System.out.println(novocarro == novocarro2);
		System.out.println(novocarro.hashCode());
		System.out.println(novocarro2.hashCode());
		System.out.println(novocarro.cor.hashCode());
		System.out.println(novocarro.marca.hashCode());
		System.out.println(novocarro.modelo.hashCode());
		System.out.println(novocarro2.cor.hashCode());
		System.out.println(novocarro2.marca.hashCode());
		System.out.println(novocarro2.modelo.hashCode());
		
		
		
	}

}
