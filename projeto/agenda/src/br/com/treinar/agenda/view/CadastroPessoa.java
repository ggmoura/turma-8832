package br.com.treinar.agenda.view;

import java.text.ParseException;
import java.util.Scanner;
import java.util.List;

import br.com.treinar.agenda.dao.PessoaDAO;
import br.com.treinar.agenda.modelo.Pessoa;
import br.com.treinar.agenda.modelo.Sexo;

public class CadastroPessoa {
	
	Scanner teclado = new Scanner(System.in);
	PessoaDAO pessoaDB = new PessoaDAO();
	
	public static void main(String[] args) {
		new CadastroPessoa().menu();
	}
	
	public void menu() {
	
		Integer opcao = null;
		do {
			System.out.println(recuperarMenu());
			opcao = teclado.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Fim do programa");
				break;
			case 1:
				pesquisarPessoa();
				break;
			case 2:
				exluirPessoa();
				break;
			case 3:
				try {
					alterarPessoa();
				} catch (ParseException e1) {
					System.out.println("erro ao atualizar pessoa");
					e1.printStackTrace();
				}
				break;
			case 4:
				try {
					cadastrarPessoa();
				} catch (ParseException e) {
					System.out.println("erro ao cadastrar pessoa");
					e.printStackTrace();
				}
				break;
			case 5:
				detalharPessoa();
				break;
			default:
				System.out.println("Opção Inválida, informe novamente!\n\n");
				break;
			}

		} while (!opcao.equals(0));
		teclado.close();
		
	}
	
	private void detalharPessoa() {
		pesquisarPessoa();
		System.out.println("Informe o ID da pessoa a ser detalhada" );
		long id = teclado.nextLong();
		Pessoa pessoa = pessoaDB.recuperar(id);
		teclado.nextLine();
		pessoa = pessoaDB.recuperar(id);
		System.out.println( pessoa.toString());
	}

	private void cadastrarPessoa() throws ParseException {
		Pessoa pessoa = new Pessoa();
		teclado.nextLine();
		System.out.println("Informe o nome: ");
		pessoa.setNome(teclado.nextLine());
		System.out.println("Informe o sexo [ F ou M]: ");
		pessoa.setSexo(Sexo.valueOf(teclado.nextLine()));
		System.out.println("Informe a data de nascimento: ");
		String dataTeclado = teclado.nextLine();
		pessoa.setDataNascimentoStr(dataTeclado);
		pessoaDB.inserir(pessoa);
		System.out.println("Pessoa cadastrada com sucesso");
	}

	private void alterarPessoa() throws ParseException {
		pesquisarPessoa();
		System.out.println("Informe o ID da pessoa a ser alterada" );
		long id = teclado.nextLong();
		Pessoa pessoa = pessoaDB.recuperar(id);
		teclado.nextLine();
		System.out.println("Informe novo nome: ");
		String nome = teclado.nextLine();
		if (nome != null && !nome.equals("")) {
			pessoa.setNome(nome);
		}
		System.out.println("Informe o sexo [ F ou M]: ");
		String sexoStr = teclado.nextLine();
		if (sexoStr != null && !sexoStr.equals("")) {
			pessoa.setSexo(Sexo.valueOf(sexoStr));
		}
		System.out.println("Informe a data de nascimento: ");
		String dataTeclado = teclado.nextLine();
		if (dataTeclado != null && !dataTeclado.equals("")) {
			pessoa.setDataNascimentoStr(dataTeclado);
		}
		pessoaDB.atualizar(pessoa);
	}

	private void exluirPessoa() {
		pesquisarPessoa();
		System.out.println("\n\tInforme o ID da pessoa a ser excluida" );
		Pessoa pessoa = new Pessoa();
		pessoa.setId(teclado.nextLong());
		pessoaDB.excluir(pessoa);
	}

	private void pesquisarPessoa() {
		List<Pessoa> pessoas  = pessoaDB.listartodos();
		for (Pessoa pessoa : pessoas) {	
			StringBuilder pessoaDisplay = new StringBuilder(); 
			System.out.println( pessoaDisplay.append(pessoa.getId()).append(" ").append(pessoa.getNome()));
		}
	
	}

	private String recuperarMenu() {
		return "\n\nInforme\n\t"
				+ "0 - Sair\n\t"
				+ "1 - Pesquisar\n\t"
				+ "2 - Excluir \n\t"
				+ "3 - Editar\n\t"
				+ "4 - Cadastrar\n\t"
				+ "5 - Detalhar\n\t";
	}
	
}
