package br.com.treinar.caixa.visao;

import java.util.Scanner;

public class TelaPrincipal {
	
	public void iniciarAtividades() {
		Scanner leitor = new Scanner(System.in);
		Integer opcao = null;
		do {
			System.out.println("Informe\n\t0 - Sair\n\t1 - Criar Conta\n");
			opcao = leitor.nextInt();
		} while (opcao != 0);
		leitor.close();
	}

}
