package br.com.treinar.caixa.visao;

import java.util.Scanner;

import br.com.treinar.caixa.modelo.Conta;
import br.com.treinar.caixa.modelo.Pessoa;

public class TelaPrincipal {

	Conta conta = null;
	private Scanner leitor;
	
	public TelaPrincipal() {
		leitor = new Scanner(System.in);
	}

	public void iniciarAtividades() {
		Integer opcao = null;
		do {
			System.out.println(recuperarMenu());
			opcao = leitor.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Fim do programa");
				break;
			case 1:
				criarConta();
				break;
			case 2:
				exibirDados();
				break;
			case 3:
				depositar();
				break;
			case 4:
				sacar();
				break;

			default:
				System.out.println("Opção Inválida, informe novamente!\n\n");
				break;
			}

		} while (opcao != 0);
		leitor.close();
	}

	private void sacar() {
		System.out.print("Informe o valor a ser sacado: ");
		Boolean sacou = conta.sacar(leitor.nextDouble());
		System.out.println(sacou ? "Sacou!" : "Não sacou!");
//		if (sacou) {
//			System.out.println("Sacou legal!");
//		} else {
//			System.out.println("Não sacou!");
//		}
	}

	private void depositar() {
		System.out.print("Informe o valor a ser depositado: ");
		Double valor = leitor.nextDouble();
		conta.depositar(valor);
	}

	private void exibirDados() {
		System.out.println("\n");
		System.out.println("\tNumero da conta: " + conta.numeroConta);
		System.out.println("\tAgencia: " + conta.agencia);
		System.out.println("\tSaldo: " + conta.saldo);
		System.out.println("\tNome do titular: " + conta.pessoa.nome);
		System.out.println("\tCpf do titular: " + conta.pessoa.cpf);
		System.out.println("\n");
	}

	private void criarConta() {
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
	}

	private String recuperarMenu() {
		return "Informe\n\t"
				+ "0 - Sair\n\t"
				+ "1 - Criar Conta\n\t"
				+ "2 - Exibir dados da conta\n\t"
				+ "3 - Depositar\n\t"
				+ "4 - Sacar";
	}

}
