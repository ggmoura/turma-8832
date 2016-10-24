package br.com.treinar.estudo.exception;

public class TestesExceptionLang {

	public static void main(String[] args) {
		Integer i = null;
		
		try {
			method(i);
		} catch (java.lang.NullPointerException e) {
			System.out.println("A variavel i estah nula");
		}
		System.out.println("fim do programa");
	}

	private static void method(Integer i) {
		System.out.println("inicio do try");
		method2(i);			
		System.out.println("final do try");
	}

	private static void method2(Integer i) {
		while (i > 5) {
			System.out.println("exception");
		}
	}
	
}
