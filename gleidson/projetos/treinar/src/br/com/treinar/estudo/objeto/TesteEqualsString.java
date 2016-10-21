package br.com.treinar.estudo.objeto;

public class TesteEqualsString {

	
	public static void main(String[] args) {
		String nome = "Maria Sophia";
		String nome1 = "Maria Sophia";
		String nome2 = new String("Maria Sophia");
		
		System.out.println(nome.equals(nome1));
		System.out.println(nome == nome1);
		System.out.println(nome == nome2);
		System.out.println(nome.equals(nome2));
		
		StringBuilder sb = new StringBuilder();
		
//		for (int i = 0; i < 1000000; i++) {
//			sb.append(nome).append(" ");
//		}
		System.out.println(sb);
		
		String gleidson = "Gleidosn";
		String moura = "Moura";
		
		String nomeSobrenome = gleidson + " " + moura;
		System.out.println(nomeSobrenome);
		
		StringBuilder nomeSobrenomeSb = new StringBuilder();
		nomeSobrenomeSb.append(gleidson).append(" ").append(moura);
		System.out.println(nomeSobrenomeSb);
		
		
	}
	
}
