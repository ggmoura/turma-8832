package br.com.treinar.caixa.visao;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import sun.security.jca.GetInstance.Instance;
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
		System.out.println("\n");
		if (conta instanceof ContaCorrente) {
			ContaCorrente contaCorrente = (ContaCorrente)conta;
			System.out.println("Limite de crédito: " + contaCorrente.getLimiteCredito());
			System.out.println("Taxa de manutenção: " + contaCorrente.getTaxaManutencao());
		} else if (conta instanceof ContaInvestimento) {
			ContaInvestimento contaInvestimento = (ContaInvestimento)conta;
			System.out.println("Taxa de Rendimento: " + contaInvestimento.getTaxaRendimento());
			System.out.println("Taxa de manutenção: " + contaInvestimento.getTaxaManutencao());			
		}
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
		System.out.print("Informe o valor do Limite de Cerédito: ");
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
				+ "4 - Sacar";
	}
	
	private String recuperarMenuTipoConta() {
		return "Informe\n\t"
				+ "1 - Conta Corrente\n\t"
				+ "2 - Conta Poupança\n\t"
				+ "3 - Conta Salario\n\t"
				+ "4 - Conta Investimento\n\t";
	}
	
}
