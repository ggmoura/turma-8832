package EstudoArray;


public class AtividadeArray {
	
	 static void imprimir(String[] values){
		 for (int i = 0; i < values.length; i++){
		 	 imprimir(values[i]);
		}
	 }
	 
	 static void imprimir(String value){
			System.out.println(value);
		}
			 
	 
//		 	 //Este array não precisa ter tamanho para ser impresso
//		 static void imprimir (String... values);
//		 for (int i = 0; i < values.length; i++) {
//			 imprimir(values[i]);
			 
	
	 
	public static void main(String[] args) {
		
		String[] nomes = new String[5];
		
		nomes[0] = "Michelle";
		nomes[1] = "Daniella";
		nomes[2] = "Junior";
		nomes[3] = "Cassio";
		nomes[4] = "Fabio";

		String[] nomes2 = new String[5];
		
		for (int i = 0; i < nomes.length; i++) {
			nomes2[i] = nomes[i];

		}
		
		for (int i = 0; i < nomes2.length; i++) {
			System.out.println(nomes2[i]);
			
		}imprimir(nomes);
		

	
	}

	
}
