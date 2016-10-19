package EstudoArray;

public class AtividadeArray2 {
	
 static void imprimir (String... values){
 for (int i = 0; i < values.length; i++) {
		 imprimir(values[i]);
 	}
 }
	static void imprimir(String value){
		System.out.println(value);
}
			
	public static void main(String[] args) {
			
	String[] nomes = new String[5];
			
			nomes[0] = "Michelle";
			nomes[1] = "Daniella";
			nomes[2] = "Junior";
			nomes[3] = "Cassio";
			nomes[4] = "Fabio";
			
			imprimir(nomes);
			 
			
				
	}
		
}
