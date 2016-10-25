package testerquals;

public class TesteEqualsString2 {
	
	
	public static void main(String[] args) {
		
		Carro2 novocarro  = new Carro2();
		Carro2 novocarro2 = new Carro2();

		novocarro.cor     = "Azul";
		novocarro.marca   = "Fiat";
		novocarro.modelo  = "Palio";
		
		novocarro2.cor    = null;
		novocarro2.marca  = null;
		novocarro2.modelo = null;
		
		System.out.println(novocarro);
		System.out.println(novocarro2);
		
		
	}

}

