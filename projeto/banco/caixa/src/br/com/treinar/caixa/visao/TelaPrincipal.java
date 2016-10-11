package br.com.treinar.caixa.visao;

import java.util.Scanner;

import br.com.treinar.caixa.modelo.Conta;
import br.com.treinar.caixa.modelo.Pessoa;

public class TelaPrincipal {

	Conta conta = null;

	public void iniciarAtividades() {
		Scanner leitor = new Scanner(System.in);
		Integer opcao = null;
		do {
			System.out
					.println("Informe\n\t0 - Sair\n\t1 - Criar Conta\n\t2 - Exibir dados da conta");
			opcao = leitor.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Fim do programa");
				break;
			case 1:
				conta = new Conta();
				System.out.print("Informe o numero da conta: ");
				conta.numeroConta = leitor.nextInt();
				System.out.print("Informe a agencia: ");
				conta.agencia = leitor.nextInt();
				System.out.print("Informe o saldo: ");
				conta.saldo = leitor.nextDouble();
				leitor.nextLine();
				conta.pessoa = new Pessoa();
				System.out.print("Informe o nome do titular: ");
				conta.pessoa.nome = leitor.nextLine();
				System.out.print("Informe o cpf do titular: ");
				conta.pessoa.cpf = leitor.nextLong();
				break;
			case 2:
				System.out.println("\n");
				System.out.println("\tNumero da conta: " + conta.numeroConta);
				System.out.println("\tAgencia: " + conta.agencia);
				System.out.println("\tSaldo: " + conta.saldo);
				System.out.println("\tNome do titular: " + conta.pessoa.nome);
				System.out.println("\tCpf do titular: " + conta.pessoa.cpf);
				System.out.println("\n");
				break;

			default:
				System.out.println("Opção Inválida, informe novamente!\n\n");
				break;
			}

		} while (opcao != 0);
		leitor.close();
	}

}
