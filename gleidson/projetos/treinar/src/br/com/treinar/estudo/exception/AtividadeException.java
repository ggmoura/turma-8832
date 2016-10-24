package br.com.treinar.estudo.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AtividadeException {

	public static void main(String[] args) {
		try {
			action();
		} catch (Exception e) {
			System.out.println(e.getMessage());;
		}
	}

	private static void action() throws Exception {
		Scanner leitor = new Scanner(System.in);
		Integer i = null;
		System.out.print("Informe um número: ");
		try {
			i = leitor.nextInt();
			System.out.println("O número informado foi: " + i);
		} catch (InputMismatchException e) {
			throw new RuntimeException("Numero invalido");
		} finally {
			leitor.close();
		}
		
		
//		try with resource
//		try(Scanner leitor = new Scanner(System.in)) {
//			leitor.next();
//		}
		
		
		
	}
	
}
