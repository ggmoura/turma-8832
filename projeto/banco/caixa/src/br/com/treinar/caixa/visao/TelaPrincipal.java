package br.com.treinar.caixa.visao;

import java.util.Scanner;

import br.com.treinar.caixa.modelo.ContaCorrente;
import br.com.treinar.caixa.modelo.ContaInvestimento;
import br.com.treinar.caixa.modelo.ContaPoupanca;
import br.com.treinar.caixa.modelo.ContaSalario;
import br.com.treinar.caixa.modelo.Pessoa;
import br.com.treinar.caixa.modelo.banco.Conta;

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
			case 5:
				atualizarTaxaRendimento();
				break;
			case 6:
				exibirTaxaRendimento();
				break;

			default:
				System.out.println("Opção Inválida, informe novamente!\n\n");
				break;
			}

		} while (opcao != 0);
		leitor.close();
	}

	private void exibirTaxaRendimento() {
		System.out.println(ContaPoupanca.getTaxaRendimento());
		
	}

	private void atualizarTaxaRendimento() {
		System.out.print("Informe o novo valor da taxa de rendimento: ");
		ContaPoupanca.setTaxaRendimento(leitor.nextInt());
	}

	private void sacar() {
		System.out.print("Informe o valor a ser sacado: ");
		Boolean sacou = conta.sacar(leitor.nextDouble());
		System.out.println(sacou ? "Sacou!" : "Não sacou!");
	}

	private void depositar() {
		System.out.print("Informe o valor a ser depositado: ");
		Double valor = leitor.nextDouble();
		conta.depositar(valor);
	}

	private void exibirDados() {
		System.out.println("\n");
		System.out.println(conta.getClass().getSimpleName());
		System.out.println("\tNumero da conta: " + conta.getNumeroConta());
		System.out.println("\tAgencia: " + conta.getAgencia());
		System.out.println("\tSaldo: " + conta.recuperarSaldo());
		System.out.println("\tNome do titular: " + conta.getPessoa().getNome());
		System.out.println("\tCpf do titular: " + conta.getPessoa().getCpf());
		if (conta instanceof ContaCorrente) {
			ContaCorrente contaCorrente = (ContaCorrente)conta;
			System.out.println("\tLimite de crédito: " + contaCorrente.getLimiteCredito());
			System.out.println("\tTaxa de manutenção: " + contaCorrente.getTaxaManutencao());
		} else if (conta instanceof ContaInvestimento) {
			ContaInvestimento contaInvestimento = (ContaInvestimento)conta;
			System.out.println("\tTaxa de Rendimento: " + contaInvestimento.getTaxaRendimento());
			System.out.println("\tTaxa de manutenção: " + contaInvestimento.getTaxaManutencao());			
		}
		System.out.println("\n");
	}

	private void criarConta() {
		
		System.out.println(recuperarMenuTipoConta());
		Integer tipoConta = leitor.nextInt();
		
		switch (tipoConta) {
		case 1:
			conta = new ContaCorrente();
			criarConta((ContaCorrente)conta);
			break;
		case 2:
			conta = new ContaPoupanca();
			criarConta((ContaPoupanca)conta);
			break;
		case 3:
			conta = new ContaSalario();
			criarConta((ContaSalario)conta);
			break;
		case 4:
			conta = new ContaInvestimento();
			criarConta((ContaInvestimento)conta);
			break;

			
		default:
			System.out.println("\nTipo de conta inválido...\n");
			break;
		}
	}

	private void criarConta(ContaInvestimento conta) {
		criarConta((Conta)conta);
		System.out.print("Informe o valor da Taxa de Manutenção: ");
		conta.setTaxaManutencao(leitor.nextDouble());
		System.out.print("Informe o valor da Taxa de Rendimento: ");
		conta.setTaxaRendimento(leitor.nextDouble());
		
	}

	private void criarConta(ContaSalario conta) {
		criarConta((Conta)conta);
	}

	private void criarConta(ContaPoupanca conta) {
		criarConta((Conta)conta);
		
	}

	private void criarConta(ContaCorrente conta) {
		criarConta((Conta)conta);
		System.out.print("Informe o valor da Taxa de Manutenção: ");
		conta.setTaxaManutencao(leitor.nextDouble());
		System.out.print("Informe o valor do Limite de Crédito: ");
		conta.setLimiteCredito(leitor.nextDouble());
	}
	
	private void criarConta(Conta conta) {
		System.out.print("Informe o numero da conta: ");
		conta.setNumeroConta(leitor.nextInt());
		System.out.print("Informe a agencia: ");
		conta.setAgencia(leitor.nextInt());
		System.out.print("Informe o saldo: ");
		conta.depositar(leitor.nextDouble());
		leitor.nextLine();
		conta.setPessoa(new Pessoa());
		System.out.print("Informe o nome do titular: ");
		conta.getPessoa().setNome(leitor.nextLine());
		System.out.print("Informe o cpf do titular: ");
		conta.getPessoa().setCpf(leitor.nextLong());
	}

	private String recuperarMenu() {
		return "Informe\n\t"
				+ "0 - Sair\n\t"
				+ "1 - Criar Conta\n\t"
				+ "2 - Exibir dados da conta\n\t"
				+ "3 - Depositar\n\t"
				+ "4 - Sacar\n\t"
				+ "5 - Atualizar Taxa de Rendimento\n\t"
				+ "6 - Exibir Taxa de Rendimento";
	}
	
	private String recuperarMenuTipoConta() {
		return "Informe\n\t"
				+ "1 - Conta Corrente\n\t"
				+ "2 - Conta Poupança\n\t"
				+ "3 - Conta Salario\n\t"
				+ "4 - Conta Investimento\n\t";
	}
	
}
