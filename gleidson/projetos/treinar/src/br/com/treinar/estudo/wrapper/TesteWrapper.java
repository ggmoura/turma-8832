package br.com.treinar.estudo.wrapper;

public class TesteWrapper {

	public static void main(String[] args) {
		int idadePrimitivo1 = 0;
		int idadePrimitivo2 = 0;
		Integer idade = 5;
		System.out.println(idade);
		Integer idade2 = idade;
		idade = 6;
		System.out.println(idade2);
		System.out.println(idade);
		System.out.println(idadePrimitivo1);
		Integer idadeTres = 5;
		System.out.println(idadeTres);
		
		Integer cinco = new Integer(5);
		System.out.println(cinco);
		
		Integer milOld = 1000; 
		Integer milNew = 1000;
		System.out.println(milNew);
		System.out.println(milOld);
		
		idadePrimitivo1 = 10;
		idadePrimitivo2 = 10;
		
		System.out.println("Comparação int: " + (idadePrimitivo1 == idadePrimitivo2));
		
		Integer idadeWrapper1 = 1000;
		Integer idadeWrapper2 = 1000;

		System.out.println("Comparação Wrapper Integer: " + (idadeWrapper1 == idadeWrapper2));
		
		idadeWrapper1 = 10;
		idadeWrapper2 = new Integer(10);
		
		System.out.println("Comparação Wrapper Integer with new: " + (idadeWrapper1 == idadeWrapper2));
		
	}
	
}
