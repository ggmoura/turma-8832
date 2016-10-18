package br.com.treinar.estudo.array;

public class EstudoArray {

	public static void main(String[] args) {
		
		String[] nomes = null;
		
		System.out.println("Daqui a pouco instancio...");
		
		nomes = new String[10];
		
		nomes[0] = "10";
		nomes[1] = "Gleidson";
		nomes[2] = "Maria Sophia";
		nomes[3] = "Davi Lucas";
		nomes[4] = "Juan Pablo";
		nomes[5] = "João Carlos";
		nomes[6] = "Nathalia";
		nomes[7] = "Amanda";
		nomes[8] = "Miguel";
		nomes[9] = "Isis";
		
		System.out.println(((String)(nomes[9])).length());
		System.out.println("Tenho " + nomes.length + " nomes.");
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
	}
	
}
